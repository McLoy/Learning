package ua.vtkachenko.prospring4.ch4.SpringProfiles;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ProfileXmlConfigExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/*-config.xml");
        ctx.refresh();

        FoodProviderService foodProviderService = ctx.getBean("foodProviderService", FoodProviderService.class);
        List<Food> lunchset = foodProviderService.provideLunchSet();
        for (Food food: lunchset){
            System.out.println("Food: " + food.getName());
        }
    }
}
