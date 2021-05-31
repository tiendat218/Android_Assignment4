package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts,this);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this, contactModel.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData(){
        ContactModel contact = new ContactModel("Nguyen Van A","0777755555",R.drawable.ic_user_a);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van B", "0888899999",R.drawable.ic_user_b);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van C", "0888899999",R.drawable.ic_user_c);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van D", "0888899999",R.drawable.ic_user_d);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van E", "0888899999",R.drawable.ic_user_a);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van F", "0888899999",R.drawable.ic_user_b);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van G", "0888899999",R.drawable.ic_user_c);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van H", "0888899999",R.drawable.ic_user_d);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van Y", "0888899999",R.drawable.ic_user_a);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van K", "0888899999",R.drawable.ic_user_b);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van L", "0888899999",R.drawable.ic_user_d);
    }
}