package genet.fabien.tp3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by m4gyars on 14/04/15.
 */

public class PhotoAdapter extends BaseAdapter {

    private List<Photo> listeP;
    private Context context;
    private LayoutInflater lInflater;

    public PhotoAdapter(Context c, List<Photo> lp) {
        context = c;
        listeP = lp;
        // Le LayoutInflater permet de parser un layout XML // et de le transformer en IHM Android
        lInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return listeP.size();
    }

    public Object getItem(int position) {
        return listeP.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int pos, View cv, ViewGroup parent)
    {
        LinearLayout li;
        // récupération du layout
        if (cv == null) {
           // initialisation de l’item à partir du layout photo_item
            li = (LinearLayout) lInflater.inflate(R.layout.photo_item,parent, false);
        } else {
            li = (LinearLayout) cv;
        }

        TextView tvn = (TextView) li.findViewById(R.id.TV_Nom);
        tvn.setText(listeP.get(pos).getNom());

        return li;
    }

}
