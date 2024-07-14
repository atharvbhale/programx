/*
program 2
a
mainactivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText usn;
    EditText collegeName;
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        usn = findViewById(R.id.usn);
        collegeName = findViewById(R.id.collegeName);
        sendBtn = findViewById(R.id.SendData);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strName = name.getText().toString();
                String strUsn = usn.getText().toString();
                String strCollegeName = collegeName.getText().toString();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name", strName);
                intent.putExtra("usn", strUsn);
                intent.putExtra("collegeName", strCollegeName);
                startActivity(intent);
            }
        });
    }
}

second activity.java
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView receivedName;
    TextView receivedUsn;
    TextView receivedCollegeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        receivedName = findViewById(R.id.receivedName);
        receivedUsn = findViewById(R.id.receivedUsn);
        receivedCollegeName = findViewById(R.id.receivedCollegeName);

        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String usn = intent.getStringExtra("usn");
            String collegeName = intent.getStringExtra("collegeName");

            receivedName.setText("Name: " + name);
            receivedUsn.setText("USN: " + usn);
            receivedCollegeName.setText("College Name: " + collegeName);
        }
    }
}
xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
 xmlns:app="http://schemas.android.com/apk/res-auto"
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 tools:context=".MainActivity">
<TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_marginLeft="20dp"
 android:layout_marginTop="100dp"
 android:text="Send Data From One Activity to Another Activity"
 android:textColor="#E91E63"
 android:textSize="18sp"
 android:textStyle="bold">
</TextView>
 <EditText
 android:id="@+id/name"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_marginLeft="165dp"
 android:layout_marginTop="200dp"
 android:text="Name"
 >
 </EditText>
 <EditText
 android:id="@+id/usn"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_marginLeft="170dp"
 android:layout_marginTop="250dp"
 android:text="USN"
 >
 </EditText>
 <EditText
 android:id="@+id/collegeName"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_marginLeft="140dp"
 android:layout_marginTop="300dp"
 android:text="College Name"
 >
 </EditText>
 <Button
 android:id="@+id/SendData"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_marginLeft="150dp"
 android:layout_marginTop="400dp"
 android:text="Send Data">
 </Button>
</RelativeLayout>


activity_xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".SecondActivity">

    <TextView
        android:id="@+id/receivedName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="100dp"
        android:layout_marginLeft="20dp"
        android:textSize="18sp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/receivedUsn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/receivedName"
        android:layout_marginTop="20dp"
        android:layout_marginLeft="20dp"
        android:textSize="18sp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/receivedCollegeName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/receivedUsn"
        android:layout_marginTop="20dp"
        android:layout_marginLeft="20dp"
        android:textSize="18sp"
        android:textStyle="bold" />
</RelativeLayout>
AndroidManifest.xml
<activity android:name=".SecondActivity"></activity>

 */

/*
4. Design an application to declare layouts statically as an XML resources.
a) Declare GridLayout statically as an XML resource.
b) Declare TableLayout statically as an XML resource.
a. activity_main.xml
<GridLayout xmlns:android="http://schemas.android.com/apk/res/android"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:columnCount="2"
 android:orientation="horizontal"
 android:rowCount="4">
 <ImageButton
 android:id="@+id/imageButton1"
 android:layout_width="160dp"
 android:layout_height="90dp"
 android:src="@drawable/scene1" />
 <ImageButton
 android:id="@+id/imageButton2"
 android:layout_width="160dp"
 android:layout_height="90dp"
 android:layout_gravity="center_vertical"
 android:src="@drawable/scene2" />
 <ImageButton
 android:id="@+id/imageButton3"
 android:layout_width="160dp"
 android:layout_height="90dp"
 android:layout_gravity="center_vertical"
 android:src="@drawable/scene3" />
 <ImageButton
 android:id="@+id/imageButton4"
 android:layout_width="160dp"
 android:layout_height="90dp"
 android:layout_gravity="center_vertical"
 android:src="@drawable/scene4" />
 <ImageButton
 android:id="@+id/imageButton5"
 android:layout_width="160dp"
 android:layout_height="90dp"
 android:layout_gravity="center_vertical"
 android:src="@drawable/scene5" />
 <ImageButton
 android:id="@+id/imageButton6"
 android:layout_width="160dp"
 android:layout_height="90dp"
 android:layout_gravity="center_vertical"
 android:src="@drawable/scene6" />
</GridLayout>
Go to app > res > drawable >
main activity.java
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
}



b. activity_main.xml
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
 android:layout_width="match_parent"
 android:layout_height="match_parent">
 <!-- Add your table rows and views here -->
 <TextView
 android:id="@+id/txt"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:text="ICC Ranking of Players:"
 android:textSize = "20dp"
 android:textStyle="bold">
 </TextView>
 <TableRow android:background="#51B435" android:padding="10dp">
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Rank" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Player" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Team" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Points" />
 </TableRow>
 <TableRow android:background="#F0F7F7" android:padding="5dp">
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="1" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Virat Kohli" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="IND" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="895" />
 </TableRow>
 <TableRow android:background="#F0F7F7" android:padding="5dp">
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="2" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Rohit Sharma" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="IND" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="863" />
 </TableRow>
 <TableRow android:background="#F0F7F7" android:padding="5dp">
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="3" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Faf du Plessis" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="PAK" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="834" />
 </TableRow>
 <TableRow android:background="#F0F7F7" android:padding="5dp">
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="4" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Steven Smith" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="AUS" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="820" />
 </TableRow>
 <TableRow android:background="#F0F7F7" android:padding="5dp">
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="5" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="Ross Taylor" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="NZ" />
 <TextView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:layout_weight="1"
 android:text="817" />
 </TableRow>
</TableLayout>
MainActivity.java
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 EdgeToEdge.enable(this);
 setContentView(R.layout.activity_main);
 }
}




 */

/*
b) Display image by selecting from the gallery or storage
activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
 xmlns:app="http://schemas.android.com/apk/res-auto"
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:orientation="vertical"
 tools:context=".MainActivity"
 tools:ignore="ExtraText">
 <Button
 android:id="@+id/buttonSelectedImage"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:text="select_image"/>
 <ImageView
 android:id="@+id/selectedImage"
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:adjustViewBounds="true"
 android:contentDescription="@string/app_name" />
 android:adjustViewBounds="true"
 android:contentDescription="@string/app_name" />
</LinearLayout>
MainActivity.java
package com.example.program7a;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.InputStream;
public class MainActivity extends AppCompatActivity
{
 private static final int REQUEST_CODE_STORAGE_PERMISSION = 1;
 private static final int REQUEST_CODE_SELECT_IMAGE =  private ImageView imageSelected;
 ActivityResultLauncher<Intent> activityResultLauncher;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 imageSelected = findViewById(R.id.selectedImage);
 findViewById(R.id.buttonSelectedImage).setOnClickListener(new
View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if (ContextCompat.checkSelfPermission(
 getApplicationContext(),
Manifest.permission.READ_EXTERNAL_STORAGE
 ) != PackageManager.PERMISSION_GRANTED) {
 ActivityCompat.requestPermissions(
 MainActivity.this,
 new
String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
 REQUEST_CODE_STORAGE_PERMISSION);
 } else {
 selectImage();
 }
 }
 });
 }
 private void selectImage()
 {
 Intent intent = new

Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
 if(intent.resolveActivity(getPackageManager()) != null){
 startActivityForResult(intent,REQUEST_CODE_SELECT_IMAGE);
 }
 }
 @Override
 public void onRequestPermissionsResult(int requestCode,@Nullable
String[]
 permissions,@Nullable int[] grantResults)
 {

super.onRequestPermissionsResult(requestCode,permissions,grantResults);
 if(requestCode == REQUEST_CODE_STORAGE_PERMISSION &&
grantResults.length > 0)
 {
 if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
 {
 selectImage();
 }
 else
 {
 Toast.makeText(this, "Permission Denied",
Toast.LENGTH_SHORT).show();
 }
  }
 }
 @Override
 protected void onActivityResult(int requestCode, int resultCode,
@Nullable Intent data) {
 super.onActivityResult(requestCode, resultCode, data);
 if(requestCode == REQUEST_CODE_SELECT_IMAGE && resultCode ==
RESULT_OK){
 if(data != null){
 Uri selectedImageUri = data.getData();
 if(selectedImageUri != null){
 try{
 InputStream inputStream =
getContentResolver().openInputStream(selectedImageUri);
 Bitmap bitmap =
BitmapFactory.decodeStream(inputStream);
 imageSelected.setImageBitmap(bitmap);
 }catch (Exception exception){
 Toast.makeText(this,exception.getMessage(),
Toast.LENGTH_SHORT).show();
 }
 }
 }
 }
 }
}

 */