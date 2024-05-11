package org.example.jnest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Додаткова логіка для обробки даних та передачі їх у шаблон

        // Приклади даних для передачі у шаблон
        model.addAttribute("dashboard.title", "Dashboard");
        model.addAttribute("user", new User("John Doe"));
        model.addAttribute("capitalsOfTheWorld", createCapitalsMap());
        model.addAttribute("vehiclesList", Arrays.asList(new Vehicle("Car")));
        model.addAttribute("car", new Car("Toyota", "SUV", "Petrol", "Black"));
        model.addAttribute("searchTerm", "thymeleaf");
        model.addAttribute("index", 1);
        model.addAttribute("totalPrice", "€ 5.00");
        model.addAttribute("username", "Jane");
        model.addAttribute("user", new User("John Doe", 15));

        return "home";
    }

    private Map<String, String> createCapitalsMap() {
        Map<String, String> capitalsMap = new HashMap<>();
        capitalsMap.put("Belgium", "Brussels");
        capitalsMap.put("The Netherlands", "Amsterdam");
        return capitalsMap;
    }

    private static class User {
        private String name;
        private int followerCount;

        public User(String name) {
            this.name = name;
        }

        public User(String name, int followerCount) {
            this.name = name;
            this.followerCount = followerCount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFollowerCount() {
            return followerCount;
        }

        public void setFollowerCount(int followerCount) {
            this.followerCount = followerCount;
        }
    }

    private static class Vehicle {
        private String name;

        public Vehicle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private static class Car {
        private String brand;
        private String type;
        private String fuelType;
        private String color;

        public Car(String brand, String type, String fuelType, String color) {
            this.brand = brand;
            this.type = type;
            this.fuelType = fuelType;
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}