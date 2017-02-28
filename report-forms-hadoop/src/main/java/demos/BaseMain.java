package demos;

/**
 * <p>Title: BaseMain</p>
 * <p>Description: </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2017/2/27 16:39
 */
public class BaseMain {

    protected final String NAMESPACE = this.getClass().getName();

    public static void main(String[] args) {

        BaseMain baseMain = new BaseMain();
        System.out.println(baseMain.NAMESPACE);

    }

}
