package ua.vtkachenko.prospring4.ch4.SpringProfiles.highschool;

import ua.vtkachenko.prospring4.ch4.SpringProfiles.Food;
import ua.vtkachenko.prospring4.ch4.SpringProfiles.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchset = new ArrayList<Food>();
        lunchset.add(new Food("Coke"));
        lunchset.add(new Food("Hamburger"));
        lunchset.add(new Food("French Fries"));
        return lunchset;
    }
}
