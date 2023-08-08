package jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CategoryCRUD implements CommandLineRunner {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void showCategoryCount() {
		Integer count = jdbcTemplate.queryForObject("select count(*) from categories", Integer.class);
		System.out.println("Count = " + count);
	}

	public void addCategory(String code, String description) {
		jdbcTemplate.update("insert into categories values(?,?)", code, description);
		System.out.println("Added Successfully!");
	}

	public void listCategories() {
		var cats = jdbcTemplate.queryForList("select catcode as code, catdesc as description from categories");

		for (var cat : cats) {
			System.out.printf("%-10s %-30s\n",
					cat.get("code"),cat.get("description"));
		}
	}
	
	public void listCatObjects() {
		List<Category> categories = 
				jdbcTemplate.query("select * from categories order by catcode",
				// RowMapper (mapRow(rs, int)) is implemented using Lambda Expression
				(rs, rowNum) -> 
				    new Category(rs.getString("catcode"),rs.getString("catdesc")));

		for (Category c : categories)
			System.out.printf("%-10s  %s\n", c.getCode(), c.getDescription());
	}

	@Override
	public void run(String... args) throws Exception {
		// showCategoryCount();
		// addCategory("cat111", "Category 111");
		// listCategories();
		listCatObjects();
	}

}
