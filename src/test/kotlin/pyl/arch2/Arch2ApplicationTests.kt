package pyl.arch2

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.JdbcTemplate

@SpringBootTest
class Arch2ApplicationTests {

    @Autowired
    private lateinit var jdbcTemplate: JdbcTemplate

    @Test
    fun contextLoads() {
        val queryForList = jdbcTemplate.queryForList("select * from users")
        println(queryForList)
    }

}
