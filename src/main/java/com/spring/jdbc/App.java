package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // spring jdbc -> JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        // insert
//        Student student = new Student();
//        student.setId(666);
//        student.setName("jack");
//        student.setCity("Chennai");
//        
//        int result = studentDao.insert(student);
//        System.out.println(result);
//        
        
        // update
//        Student student = new Student();
//        student.setId(111);
//        student.setName("John");
//        student.setCity("Miami");
//        int result = studentDao.change(student);
//        System.out.println(result);
        
        
        // delete
//        int result = studentDao.delete(1);
//        System.out.println(1);
//        
        
        
        
        
        Student result = studentDao.getStudent(1111);
        System.out.println(result);
        
        
        
        
        /*
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        // insert query
        String query = "insert into student(id,name,city) values(?,?,?)";
        
        //fire query
        int result = template.update(query, 456, "Uttam Kumar", "Kanpur");
        System.out.println("number of record inserted..." + result);
        */
    }
}
