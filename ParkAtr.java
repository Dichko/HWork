class Park {
    private String name;
    private Attraction[] attractions;
    private int attractionCount;

    public Park(String name, int maxAttractions) {
        this.name = name;
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount++] = new Attraction(name, workingHours, price);
        }
    }

    public void showAttractions() {
        for (int i = 0; i < attractionCount; i++) {
            attractions[i].printInfo();
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println();
        }
    }
}

public class ParkAtr {
    public static void main(String[] args) {
        Park park = new Park("Парк им.Ленина", 3);
        park.addAttraction("Ромашка", "10:00 - 20:00", 7);
        park.addAttraction("Лодочки", "10:00 - 20:00", 5);
        park.addAttraction("Комната смеха", "14:00 - 23:00", 15);
        park.showAttractions();
    }
}

