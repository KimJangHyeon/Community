package toy.vscom.community.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearchControllerTest {
	@Autowired
	SearchController searchController;
	
	@Test
	void redisTest() {
		searchController.startRedis();
	}
}