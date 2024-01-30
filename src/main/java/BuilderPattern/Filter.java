package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected  int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer s : source) {
            if (s < treshold) {
                logger.log("Элемент \"" + s + "\" не проходит порог");
            } else {
                logger.log("Элемент \"" + s + "\" проходит");
                result.add(s);
            }
        }

        logger.log("Прошло фильтр " + result.size() + " элемента(ов) из " + source.size());
        return result;
    }
}
