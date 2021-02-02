package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HireWheelsApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
        UsersDao usersDao = context.getBean(UsersDao.class);
        Users users = new Users();
        users.setFirstName("Alok");
        users.setLastName("Ydav");
        users.setEmail("alok123@gmail.com");
        users.setPassword("alok@123");
        users.setMobile_no("1234567890");
        users.setWallet_money(12000);

        System.out.println("Before Saving: " + users);

        Users savedUsers = usersDao.save(users);
        System.out.println("After saving: " + savedUsers);

        Users users2 = new Users();
        users2.setFirstName("Alka");
        users2.setLastName("Yadaav");
        users2.setEmail("alka123@gmail.com");
        users2.setPassword("alka@123");
        users2.setMobile_no("1256735890");
        users2.setWallet_money(18000);

        System.out.println("Before Saving: " + users);

        Users savedUsers2 = usersDao.save(users2);
        System.out.println("After saving: " + savedUsers2);

        Users users3 = new Users();
        users3.setFirstName("Amit");
        users3.setLastName("Yadaaav");
        users3.setEmail("amit123@gmail.com");
        users3.setPassword("amit@123");
        users3.setMobile_no("1658867890");
        users3.setWallet_money(10000);

        System.out.println("Before Saving: " + users);

        Users savedUsers3 = usersDao.save(users3);
        System.out.println("After saving: " + savedUsers3);


        Users users4 = new Users();
        users4.setFirstName("Aditya");
        users4.setLastName("Yaadav");
        users4.setEmail("aditya123@gmail.com");
        users4.setPassword("aditya@123");
        users4.setMobile_no("1235843890");
        users4.setWallet_money(16789);

        System.out.println("Before Saving: " + users4);

        Users savedUsers4 = usersDao.save(users4);
        System.out.println("After saving: " + savedUsers4);

        Users users5 = new Users();
        users5.setFirstName("loki");
        users5.setLastName("Yaddav");
        users5.setEmail("loki123@gmail.com");
        users5.setPassword("loki@123");
        users5.setMobile_no("1234967890");
        users5.setWallet_money(8000);

        System.out.println("Before Saving: " + users5);

        Users savedUsers5 = usersDao.save(users5);
        System.out.println("After saving: " + savedUsers5);

        Users retrievedUsers = usersDao.findById(savedUsers.getUser_id());
        System.out.println("After retrieving: " + retrievedUsers);

        users.setEmail("alok1234@gmail.com");
        Users updatedUsers = usersDao.update(users);
        System.out.println("After updating: " + updatedUsers);

        usersDao.delete(updatedUsers);
        System.out.println("After deleting: " + usersDao.findById(updatedUsers.getUser_id()));

        Users retrievedUsersByFirstName = usersDao.findByUserFirstName(savedUsers.getFirstName());
        System.out.println("After retrieving: " + retrievedUsersByFirstName);

        Users retrievedUsersByLastName = usersDao.findByUserLastName(savedUsers.getLastName());
        System.out.println("After retrieving: " + retrievedUsersByLastName);

        Users retrievedUsersByEmail = usersDao.findByUserEmail(savedUsers.getEmail());
        System.out.println("After retrieving: " + retrievedUsersByEmail);

        Users retrievedUsersByMobileNumber = usersDao.findByUserMobileNumber(savedUsers.getMobile_no());
        System.out.println("After retrieving: " + retrievedUsersByMobileNumber);



    }

}
