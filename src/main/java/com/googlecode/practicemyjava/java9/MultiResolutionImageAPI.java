package com.googlecode.practicemyjava.java9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.MultiResolutionImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class MultiResolutionImageAPI {
    private static final Logger LOGGER = LoggerFactory.getLogger(MultiResolutionImageAPI.class);

    public static void main(String[] args) {
        List<String> imageLocations = List.of(
                "https://upload.wikimedia.org/wikipedia/commons/2/2d/Mango_KPride_Asit_fs.JPG",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mango_KPride_Asit_fs.JPG/1200px-Mango_KPride_Asit_fs.JPG",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mango_KPride_Asit_fs.JPG/640px-Mango_KPride_Asit_fs.JPG",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mango_KPride_Asit_fs.JPG/193px-Mango_KPride_Asit_fs.JPG"
        );

        List<Image> imgList = imageLocations.stream().map(url -> {
            try {
                return ImageIO.read(new URL(url));
            } catch (IOException e) {
                LOGGER.info("Error Reading The Image From File Location. Reason : " + e.getMessage());
            }
            return null;
        }).collect(Collectors.toList());

        MultiResolutionImage mrImages = new BaseMultiResolutionImage(imgList.toArray(new Image[0]));

        List<Image> diffResolutions = mrImages.getResolutionVariants();

        LOGGER.info("Number of available resolutions for the same image: " + diffResolutions.size());

        Image img1 = mrImages.getResolutionVariant(1920, 1080);
        LOGGER.info("Retrieved Image variant for a 21.5 inch monitor with high resolution [{},{}] has resolution [{},{}]",
                1920, 1080, img1.getWidth(null), img1.getHeight(null));

        Image img2 = mrImages.getResolutionVariant(1280, 768);
        LOGGER.info("Retrieved Image variant for a simple desktop monitor [{},{}] has resolution [{},{}]",
                1280, 768, img2.getWidth(null), img2.getHeight(null));

        Image img3 = mrImages.getResolutionVariant(640, 360);
        LOGGER.info("Retrieved Image variant for a small device resolution [{},{}] has resolution [{},{}]",
                768, 600, img3.getWidth(null), img3.getHeight(null));

        Image img4 = mrImages.getResolutionVariant(240, 120);
        LOGGER.info("Retrieved Image variant for an extra small device resolution [{},{}] has resolution [{},{}]",
                240, 120, img4.getWidth(null), img4.getHeight(null));
    }
}
