package com.example.visitingcardmaker;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void onEmailClick(View view) {
        String emailAddress = getString(R.string.email_address);
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + emailAddress));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body of the email");
        startActivity(emailIntent);
    }
    public void onPhoneCallClick(View view) {
        String phoneNumber = "tel:" + getString(R.string.phone_number);
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse(phoneNumber));
        startActivity(callIntent);
    }
    public void onPortfolioClick(View view) {
        String url = "https://subarnasaha08.github.io/Resume/";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void onFacebookClick(View view) {
        String url = "https://www.facebook.com/subarna.saha.50746444";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void onGithubClick(View view) {
        String url = "https://github.com/SubarnaSaha08";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void onLinkedInClick(View view) {
        String url = "https://www.linkedin.com/in/subarna-saha-18817221b/";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
    public void onWhatsappClick(View view) {
        String url = "https://api.whatsapp.com/send?phone=8801748820307";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }





}