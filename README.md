## QR Code Generator with Spring boot

### The Below two lines are enough to generate the QR code.

QRCodeWriter qrCodeWriter = new QRCodeWriter();

BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 250, 250);


### Dependencies

    <dependency>
      <groupId>com.google.zxing</groupId>
      <artifactId>core</artifactId>
      <version>3.3.0</version>
    </dependency>

    <dependency>
      <groupId>com.google.zxing</groupId>
      <artifactId>javase</artifactId>
      <version>3.3.0</version>
    </dependency>

