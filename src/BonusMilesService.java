public class BonusMilesService {
    public int calculate(int price) {//параметры
        int rublesAmount = 20;
        int miles = (price / rublesAmount); // 1 миля за каждые 20 рублей
        return miles;
    }
}
