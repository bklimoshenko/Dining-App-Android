package JSONFiles;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * A collection of meals (breakfast, lunch, dinner, late night) for a particular day
 */
public class DayMenu implements Serializable {

    private String url; // menu URL
    private Map<String, MealMenu> meals;

    /**
     * Default constructor, needed by Jackson deserializer
     */
    public DayMenu() {
    }

    /**
     * Construct the day menu from a given menu HTML page. The menu has to be generated by Aurora
     * Information System's FoodPro program.
     *
     * @param url The url to the HTML menu.
     */
    public DayMenu(String url) {
    }

    public String getUrl() {
        return url;
    }

    public Map<String, MealMenu> getMeals() {
        return meals;
    }

    @Override
    public String toString() {
        return "DayMenu{" +
            "url='" + url + '\'' +
            ", meals=" + meals +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DayMenu dayMenu = (DayMenu) o;
        return Objects.equals(url, dayMenu.url) &&
            Objects.equals(meals, dayMenu.meals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, meals);
    }
}
