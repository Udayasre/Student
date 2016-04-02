package com.udaya.maven.Student;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyGroupTest {

	@Test
	public void testStudyGroupClass() {
       	
        // prepare the data for test
        final List<Student> testStudents = new ArrayList<Student>();
        testStudents.add(new Student(1, "Student No.1", 60));
        testStudents.add(new Student(2, "Student No.2", 70));
        testStudents.add(new Student(3, "Student No.2", 80));
        
        // Start the unit test
        final StudyGroup testGroup = new StudyGroup();
        for(Student student: testStudents) {
            testGroup.addStudent(student);
        }
        assertEquals(testGroup.getGroupSize(), testStudents.size());
        
        Student testStudent = testStudents.get(0);
        Student returnedStudent = testGroup.getStudent(testStudent.getId());
        assertSame(returnedStudent, testStudent);
        assertEquals(returnedStudent.getId(), testStudent.getId());
        assertEquals(returnedStudent.getName(), testStudent.getName());
        assertEquals(returnedStudent.getScore(), testStudent.getScore());
        
        testGroup.removeStudent(testStudent.getId());
        assertEquals(testGroup.getGroupSize(), testStudents.size() - 1);
        
        testGroup.clear();
        assertEquals(testGroup.getGroupSize(), 0);
       
     }
	public void test() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html"); 
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest1 executed"); 
		Thread.sleep(2000); 
		System.out.print("junittest1 class is executed"); 
		driver.quit(); 
		} 
	
	
}
