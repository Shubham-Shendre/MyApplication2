package in.nagstud.android.myapplication2;

/**
 * Created by dell on 12/13/2017.
 */

public class Faculty {

    String id,name,code,trade;

    public Faculty(String id, String name, String code, String trade)
    {
        this.id = id;
        this.name = name;
        this.code =code;
        this.trade = trade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getTrade() {
        return trade;
    }
}