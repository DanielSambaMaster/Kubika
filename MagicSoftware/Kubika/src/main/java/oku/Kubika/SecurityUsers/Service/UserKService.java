package oku.Kubika.SecurityUsers.Service;

import oku.Kubika.SecurityUsers.Model.Kubikers;
import oku.Kubika.SecurityUsers.Repository.RepositoryUsersK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Random;



@Service
public class UserKService implements UserDetailsService {

    @Autowired
    RepositoryUsersK repositoryUsersK;

    public String genUserId(String name, String userName) {
        String generatedUserId = "";
        while (repositoryUsersK.findByUserId(generatedUserId)==null){
          Random number = new Random();
          int num = number.nextInt(0, 1000);
           generatedUserId = name.toLowerCase()+userName.toLowerCase()+num;
      }

        return generatedUserId;
    }

    public Kubikers register(String name, String password){

            Kubikers newUser = new Kubikers(name, "username", password);

      return null;
    }
    public String login( ){



        return null;
    }






    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        return repositoryUsersK.findByUserId(userId);
    }
}
