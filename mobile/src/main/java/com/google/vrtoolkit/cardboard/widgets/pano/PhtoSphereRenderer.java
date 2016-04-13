package com.google.vrtoolkit.cardboard.widgets.pano;


import android.content.Context;

import com.google.vrtoolkit.cardboard.widgets.common.VrWidgetRenderer;

/**
 * Created by asad on 4/13/16.
 */
public class PhtoSphereRenderer extends VrPanoramaRenderer{

    public PhtoSphereRenderer(Context context, VrWidgetRenderer.GLThreadScheduler glThreadScheduler, float xMetersPerPixel, float yMetersPerPixel, int screenRotation)
    {
        super(context, glThreadScheduler, xMetersPerPixel, yMetersPerPixel, screenRotation, new VrPanoramaView(context));
    }
}