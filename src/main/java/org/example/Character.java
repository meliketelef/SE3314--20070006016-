package org.example;

public class Character {

      // Encapsulation: Fields are private to block direct access.
        private String name;
        private int age;

        public Character(String name, int age) {
            // Bug Fix: 'this' is used to refer to the instance variables instead of the parameters.
            this.name = name;
            this.age = age;
        }

       // Name getter: Provides read access to the private 'name' field.
        public String getName() {
            return name;
        }

       // Name setter: Provides write access to the private 'name' field.
        public void setName(String name) {
            this.name = name;
        }

       // Age getter: Provides read access to the private 'age' field.
        public int getAge() {
            return age;
        }

        // Age setter: Provides write access to the private 'age' field.
        public void setAge(int age) {
            this.age = age;
        }
    }

