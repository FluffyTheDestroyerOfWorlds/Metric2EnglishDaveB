package com.example;

import java.text.DecimalFormat;

public class MeasureConvert {
        public static void main(String[] args)  {

            int nMeter = 30;
            int nFeet = 0;
            int nKm = 168;
            int nMile = 0;
            int nCm = 47;
            int nInch = 0;
            double dKPH = 27.0;
            double dFPS = 0.0;
            int nLiters = 92;
            int nGallon = 0;
            int nKg = 200;
            int nPound = 0;
            double d = 0.00;


            double cMeter2Feet = 3.28;
            double cKM2Mile = .62137;
            double cCM2Inch = .3937;
            double cLiter2Gallon = .26417;
            double cKg2Pounds = 2.2046;

    /* Begin Conversion */

            nFeet = (int)(nMeter * cMeter2Feet);
            nMile = (int)(nKm * cKM2Mile);
            nInch = (int)(nCm * cCM2Inch);
            dFPS = dKPH * cKM2Mile;
            nGallon = (int)(nLiters * cLiter2Gallon);
            nPound = (int)(nKg * cKg2Pounds);


            System.out.println(nMeter + " meters is " + nFeet + " feet" );
            System.out.println(nKm + " kilometers is " + nMile + " miles" );
            System.out.println(nCm + " centimeters is " + nInch + " inches" );
            DecimalFormat df = new DecimalFormat("####.##");
            System.out.println(dKPH + " Kilometers per Hour is " + df.format(dFPS) + " Miles per Hour" );
            System.out.println(nLiters + " Liters is " + nGallon + " gallons" );
            System.out.println(nKg + " Kilograms is " + nPound + " lbs" );


        }
}
