package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.hardware.Camera;

import com.google.zxing.Result;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.security.acl.Permission;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
import pub.devrel.easypermissions.EasyPermissions;

public class tela_scanner3 extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    TextView textView;
    private ZXingScannerView scannerView;
    private TextView txtResult;
    private Object tela_scanner4;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_scanner3);
        //Init
        scannerView = (ZXingScannerView) findViewById(R.id.zxscan);
        txtResult = (TextView) findViewById(R.id.txt_result);

        //Request permission
        Dexter.withContext(this)
                .withPermission(Manifest.permission.CAMERA)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                        scannerView.startCamera();
                        scannerView.setResultHandler(tela_scanner3.this);
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                        Toast.makeText(tela_scanner3.this, "Você precisa aceitar essa permissão!", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {

                    }
                })
                .check();
    }
    @Override
    protected void onDestroy() {
        scannerView.stopCamera();

        super.onDestroy();
    }

    @Override
    public void handleResult(Result rawResult) {
        txtResult.setText(rawResult.getText());
        scannerView.startCamera();{
        }

    }
}


