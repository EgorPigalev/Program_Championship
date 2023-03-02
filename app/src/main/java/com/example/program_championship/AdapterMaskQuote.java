package com.example.program_championship;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMaskQuote extends BaseAdapter {

    private Context mContext;
    List<MaskQuote> maskList;

    public AdapterMaskQuote(Context mContext, List<MaskQuote> maskList) {
        this.mContext = mContext;
        this.maskList = maskList;
    }

    @Override
    public int getCount() {
        return maskList.size();
    }

    @Override
    public Object getItem(int i) {
        return maskList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return maskList.get(i).getId();
    }

    private Bitmap getUserImage(String encodedImg) // Преобразование из String в Bitmap
    {

        if(encodedImg!=null&& !encodedImg.equals("null")) {
            byte[] bytes = Base64.decode(encodedImg, Base64.DEFAULT);
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        else
            return null;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContext,R.layout.item_quote,null);

        TextView title = v.findViewById(R.id.tvTitle);
        ImageView Image = v.findViewById(R.id.image);
        TextView description = v.findViewById(R.id.tvDescription);

        MaskQuote maskQuote = maskList.get(position);
        title.setText(maskQuote.getTitle());
        if(maskQuote.getImage().toString().equals("null"))
        {
            Image.setImageResource(R.drawable.absence);
        }
        else
        {
            Image.setImageBitmap(getUserImage(maskQuote.getImage()));
        }
        description.setText(maskQuote.getDescription());
        return v;
    }

}
