package com.chengzhang.contactmgr;


import com.chengzhang.contactmgr.model.contact.ContactBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.imageio.spi.ServiceRegistry;

/**
 * Created by chen on 05/07/2017.
 */
public class Application {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static void main(String[] args) {
       Contact contact = new Contact.ContactBuilder("cheng","zhang")
               .withEmail("407219781@qq.com")
               .withPhone(1122321L)
               .build();
       System.out.println(contact);
    }
}
