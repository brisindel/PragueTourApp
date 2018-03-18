package com.example.android.praguetourapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.wenceslassquare, R.drawable.oldtownsquare, R.drawable.charlesbridge, R.drawable.praguecastle, R.drawable.kampa};
    private Integer [] names = {R.string.place1, R.string.place2, R.string.place3, R.string.place4, R.string.place5 };

    public ViewPagerAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activitymain_cityslide, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        imageView.setImageResource(images[position]);
        textView.setText(names[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
