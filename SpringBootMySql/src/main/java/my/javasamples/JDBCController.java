package my.javasamples; 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class JDBCController {
    @Autowired  
    JdbcTemplate jdbc;  
 
    @RequestMapping("/insert")  
    public String insertData(){  
        jdbc.execute("insert into users(seq,user_name)values(12,'hkumar')");  
        return "Data inserted Successfully";  
    }  
}