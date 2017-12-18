package in.nagstud.android.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Branch {

    String id,name,code,wrtf,yors,ans;

    public Branch(String id, String name, String code, String wrtf, String yors, String ans)
    {
        this.id = id;
        this.name = name;
        this.code =code;
        this.wrtf =wrtf;
        this.yors =yors;
        this.ans= ans;
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

    public String getWrtf() {
        return wrtf;
    }

    public String getYors() {
        return yors;
    }

    public String getAns() {
        return ans;
    }
}