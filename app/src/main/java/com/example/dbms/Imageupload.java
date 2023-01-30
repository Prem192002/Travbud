package com.example.dbms;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
public class Imageupload extends AppCompatActivity {
    private ImageView imageView;
    private Button upload;
    private Button save;
    private final int IMG_REQUEST_ID=1;
    private Uri u;
    FirebaseStorage storage;
    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageupload);
        imageView = findViewById(R.id.imageView);
        upload = findViewById(R.id.button7);
        save = findViewById(R.id.button8);
        save.setEnabled(false);
        storage=FirebaseStorage.getInstance();
        storageReference = storage.getReference();

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setType("image/*");
                i.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(i,"select picture"),IMG_REQUEST_ID);

            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog p = new ProgressDialog(Imageupload.this);
                p.setTitle("Uploading...");
                p.show();
                if ((u!=null)){
                    StorageReference reference = storageReference.child("picture/"+ UUID.randomUUID().toString());
                    reference.putFile(u).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            p.dismiss();
                            Toast.makeText(Imageupload.this, "Uploaded successfully", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Imageupload.this, "failed", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                upload.setEnabled(true);
                save.setEnabled(false);




            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==IMG_REQUEST_ID && resultCode==RESULT_OK  && data !=null && data.getData()!=null){
            u= data.getData();
            try{
                Bitmap bit = MediaStore.Images.Media.getBitmap(getContentResolver(),u);

                imageView.setImageBitmap(bit);
                upload.setEnabled(false);
                save.setEnabled(true);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}