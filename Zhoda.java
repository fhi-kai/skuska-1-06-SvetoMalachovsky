
/**
 * Created by Igor Banduric.
 */
public interface Zhoda {

    public boolean spolocnaCislica(int prve, int druhe);

}


class MojaZhoda implements Zhoda{

    @Override
    public boolean spolocnaCislica(int prve, int druhe) {
        if (prve / 10 == druhe / 10 || prve / 10 == druhe % 10){
            return true;
        }else if (prve % 10 == druhe / 10  || prve % 10 == druhe % 10){
            return true;
        }

        return false;
    }
}


