public class Main {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;

        for (String arg : args) {
            String[] parts = arg.split("/"); // Разделяем строку по "/"
            if (parts[0].equals("Cake")) {
                // У торта есть 1 параметр (вкус)
                if (parts.length > 1) {
                    breakfast[itemsSoFar] = new Cake(parts[1]);
                } else {
                    System.out.println("Ошибка: для Cake нужно указать параметр (например, 'Шоколадная').");
                    continue;
                }
            } else if (parts[0].equals("Apple")) {
                // У яблока есть 1 параметр (размер)
                if (parts.length > 1) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                } else {
                    System.out.println("Ошибка: для Apple нужно указать параметр (например, 'Большое').");
                    continue;
                }
            }else if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();

            } else {
                System.out.println("Неизвестный продукт: " + parts[0]);
                continue;
            }
            itemsSoFar++;
        }

        Cake targetCake = new Cake("Шоколадная");
        int cakeCount = countFoods(breakfast, targetCake);
        System.out.println("Количество пирожных \"" + targetCake + "\": " + cakeCount);


        // Потребляем все продукты
        System.out.println("\nПотребляем продукты:");
        for (Food food : breakfast) {
            if (food != null) {
                food.consume();
            }
        }
    }

    public static int countFoods(Food[] foods, Food targetFood) {
        int count = 0;
        for (Food food : foods) {
            if (food != null && food.equals(targetFood)) {
                count++;
            }
        }
        return count;
    }
}
