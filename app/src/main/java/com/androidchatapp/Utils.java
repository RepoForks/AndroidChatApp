package com.androidchatapp;

import android.content.Context;
import android.content.Intent;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

/**
 * Created by vaibhav on 11/8/17.
 */

public class Utils {
    private static DatabaseReference messageRef;

//    public static void valueEventListener(DatabaseReference dbref, final String checkChild) {
//        messageRef = FirebaseDatabase.getInstance().getReference("/messages");
//
//        dbref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot child : dataSnapshot.getChildren()) {
//                    //Log.w("checkcheck", child.getKey());
//                    if (Objects.equals(child.getValue(), checkChild)) {
//                        UserDetails.chatwithID = child.getKey();
//                        //UserDetails.setChatwithID(child.getKey());
//                        final String type1, type2;
//                        type1 = UserDetails.userID + "_" + UserDetails.chatwithID;
//                        type2 = UserDetails.chatwithID + "_" + UserDetails.userID;
//
//                        messageRef.addValueEventListener(new ValueEventListener() {
//                            @Override
//                            public void onDataChange(DataSnapshot dataSnapshot) {
//                                DataSnapshot child1 = dataSnapshot.child(type1);
//                                DataSnapshot child2 = dataSnapshot.child(type2);
//                                if (child1.exists()) {
//                                    UserDetails.userType = "type1";
//                                    UserDetails.chatRef = FirebaseDatabase.getInstance().getReference("/messages").child(type1);
//                                    //chatRef2 = messageRef.child(type1);
//                                } else if (child2.exists()) {
//                                    UserDetails.userType = "type2";
//                                    UserDetails.chatRef = FirebaseDatabase.getInstance().getReference("/messages").child(type2);
//
//                                } else {
//                                    UserDetails.userType = "type1";
//                                    messageRef.child(type1).setValue("none");
//                                    UserDetails.chatRef = FirebaseDatabase.getInstance().getReference("/messages").child(type1);
//                                    //chatRef2 = messageRef.child(type2);
//                                }
//                            }
//
//                            @Override
//                            public void onCancelled(DatabaseError databaseError) {
//
//                            }
//                        });
//
//                    }
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//    }
    public static void intentWithClear(Context fromActivity, Class toActivity) {
        Intent i = new Intent(fromActivity, toActivity);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        fromActivity.startActivity(i);
    }
}
