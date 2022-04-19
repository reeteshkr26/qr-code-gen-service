package com.tech.ih.app.controller;

import java.awt.image.BufferedImage;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * TODO remandal This type ...
 *
 */
@RestController
public class AppController {

  /**
   * @param name
   * @return
   * @throws Exception
   */
  @GetMapping(path = "/api/v1/getqrcode", produces = MediaType.IMAGE_PNG_VALUE)
  public BufferedImage generateQRCodeImage(@RequestParam("name") String name) throws Exception {

    String url;
    if (name.equalsIgnoreCase("InterviewBit")) {
      url = "https://www.interviewbit.com/";
    } else if (name.equalsIgnoreCase("Javatpoint")) {
      url = "https://www.javatpoint.com/";
    } else {
      url = "https://www.google.com/";
    }
    // QRcode generator logic
    QRCodeWriter qrCodeWriter = new QRCodeWriter();
    BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 250, 250);
    return MatrixToImageWriter.toBufferedImage(bitMatrix);
  }
}
