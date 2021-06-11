package com.example.foodbook;

import com.example.foodbook.Modules.Location;
import com.example.foodbook.Modules.Menu;
import com.example.foodbook.Modules.Restaurant;
import com.example.foodbook.Repositories.LocationRepository;
import com.example.foodbook.Repositories.MenuRepository;
import com.example.foodbook.Repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class FoodBookApplication implements CommandLineRunner {

    private final RestaurantRepository restaurantRepository;
    private final MenuRepository menuRepository;
    private final LocationRepository locationRepository;

    public static void main(String[] args) {
        SpringApplication.run(FoodBookApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Menu menu = Menu.builder()
                .name("Koskos")
                .calories(500)
                .price(80)
                .description("Moroccan Food")
                .photo("Kosko.jpg")
                .build();

        Menu menu1 = Menu.builder()
                .name("Tajine")
                .calories(500)
                .price(40)
                .description("Moroccan Food")
                .photo("Kosko.jpg")
                .build();

        Location location = Location.builder().latitude(33.5232358).longitude(-7.6431258).build();
        List<Location> locationList = Collections.singletonList(location);
        List<Menu> menus = Arrays.asList(menu,menu1);
        Restaurant restaurant = Restaurant.builder()
                .name("Khalil Restaurant")
                .location(locationList)
                .menu(menus)
                .duration("15 - 30 min")
                .priceRating("affordable")
                .build();

        menuRepository.save(menu);
        menuRepository.save(menu1);
        locationRepository.save(location);
        restaurantRepository.save(restaurant);

    }
}
