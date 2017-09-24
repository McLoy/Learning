package ua.vtkachenko.prospring4.ch4.SpringProfiles.kindergarten;

import ua.vtkachenko.prospring4.ch3.Foo;
import ua.vtkachenko.prospring4.ch4.SpringProfiles.Food;
import ua.vtkachenko.prospring4.ch4.SpringProfiles.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService{
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchset = new ArrayList<Food>();
        lunchset.add(new Food("Milk"));
        lunchset.add(new Food("Biscuits"));
        return lunchset;
    }
}
