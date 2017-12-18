package in.nagstud.android.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 12/17/2017.
 */

public class ListViewAdapterBranch extends ArrayAdapter<Branch> {

    //the hero list that will be display
    private List<Branch> branchList;

    //the context object
    private Context mCtx;

    //here we are getting the herolist and context
    //so while creating the object of this adapter class we need to give herolist and context
    public ListViewAdapterBranch(List<Branch> branchList, Context mCtx)
    {
        super(mCtx, R.layout.list_itemsbranch, branchList);
        this.branchList = branchList;
        this.mCtx = mCtx;
    }

    //this method will return the list item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //getting the layoutinflater
        LayoutInflater inflater = LayoutInflater.from(mCtx);

        //creating a view with our xml layout
        View listViewItem = inflater.inflate(R.layout.list_itemsbranch, null, true);

        //getting text views
        // TextView textViewid = listViewItem.findViewById(R.id.textViewid);
        TextView textViewname = listViewItem.findViewById(R.id.textViewname);
        //  TextView textViewcode = listViewItem.findViewById(R.id.textViewcode);
        // TextView textViewtrade = listViewItem.findViewById(R.id.textViewtrade);

        //Getting the hero for the specified position
        Branch branch = branchList.get(position);

        //setting hero values to textviews
        // textViewid.setText(hero.getId());
        textViewname.setText(branch.getName());
        // textViewcode.setText(hero.getCode());
        // textViewtrade.setText(hero.getTrade());

        //returning the listitem
        return listViewItem;
    }

}
