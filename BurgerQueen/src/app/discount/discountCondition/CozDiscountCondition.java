package app.discount.discountCondition;

import app.discount.discountPolicy.DiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;

import java.util.Scanner;

public class CozDiscountCondition implements DiscountCondition {

    private boolean isSatisfied;

    private DiscountPolicy discountPolicy;

    public CozDiscountCondition(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public int applyDiscount(int price) {  //인터페이스 discount를 통해서 discount 타입의 price를 넣고 policy 는 implements를 하면될듯? 그럴려면 discount에 추상메서드를 만들고
                                            // 그걸 policy들에서 만들어 준 뒤 여기서는 구현만 해주면 되겠네 그럼 객체지향 맞나보냐
        return discountPolicy.calculateDiscountedPrice(price);
    }

    public boolean isSatisfied() {
        return isSatisfied;
    }

    private void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    public void checkDiscountCondition() {
        Scanner sc = new Scanner(System.in);

        System.out.println("코드스테이츠 수강생이십니까? (1)_예 (2)_아니오");
        String input = sc.nextLine();

        if (input.equals("1")) setSatisfied(true);
        else if (input.equals("2")) setSatisfied(false);
    }
}
