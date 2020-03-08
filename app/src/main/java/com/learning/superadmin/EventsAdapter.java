package com.learning.superadmin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class EventsAdapter extends ArrayAdapter<Events> {

    private Activity context;
    private List<Events> list;
    private DatabaseReference ref= FirebaseDatabase.getInstance().getReference("Events");;

    public EventsAdapter(Activity context,List<Events> list)
    {   super(context,R.layout.single_event_info_layouyt,list);
        this.context=context;
        this.list=list;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View listviewitem=layoutInflater.inflate(R.layout.single_event_info_layouyt,null,true);
        TextView NameD=(TextView)listviewitem.findViewById(R.id.NameD);
        TextView OrganiserD=(TextView)listviewitem.findViewById(R.id.OrganiserD);
        TextView VenueD=(TextView)listviewitem.findViewById(R.id.VenueD);
        TextView StartdateD=(TextView)listviewitem.findViewById(R.id.StartdateD);
        TextView StarttimeD=(TextView)listviewitem.findViewById(R.id.StarttimeD);
        TextView EnddateD=(TextView)listviewitem.findViewById(R.id.EnddateD);
        TextView PhoneD=(TextView)listviewitem.findViewById(R.id.phoneD);
        final TextView StatusD=(TextView)listviewitem.findViewById(R.id.statusD);
        Button buttonApprove = listviewitem.findViewById(R.id.buttonAccept);
        Button buttonReject = listviewitem.findViewById(R.id.buttonReject);
        TextView PriceD=(TextView)listviewitem.findViewById(R.id.ticketpriceD);



        final Events event=list.get(position);

        NameD.setText(event.getName());
        OrganiserD.setText(event.getOrganiser());
        VenueD.setText(event.getVenue());
        StartdateD.setText(event.getStartdate());
        StarttimeD.setText(event.getStarttime());
        EnddateD.setText(event.getEnddate());
        PhoneD.setText(event.getContactinfo());
        StatusD.setText(event.getStatus());
        PriceD.setText(event.getTicketprice());

        buttonApprove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref.child(event.getId()).child("status").setValue("Approved");
               String s="Approved";
               StatusD.setText(s);

            }
        });

        buttonReject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ref.child(event.getId()).removeValue();
                /*ref.child(event.getId()).child("status").setValue("Rejected");
                String s="Rejected";
                StatusD.setText(s);*/
            }
        });






        return listviewitem;
    }


}

