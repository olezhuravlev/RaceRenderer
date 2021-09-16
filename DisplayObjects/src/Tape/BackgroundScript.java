package RaceRenderer.Tape;

import RaceRenderer.Common.Functions;

import static RaceRenderer.Common.CommonVariables.Alignment.AlignH_Left;
import static RaceRenderer.Common.CommonVariables.Alignment.AlignH_Right;
import static RaceRenderer.Common.CommonVariables.Color.RED;

public class BackgroundScript implements Functions {

    Color ValueCentralLineColor;
    Color ScaleFontColor;
    Color ScaleFontOutlineColor;
    Color ScaleFontColor_Neg;
    Color ScaleFontOutlineColor_Neg;
    Color ScaleBigIntervalColor;
    Color ScaleSmallIntervalColor;
    Color TitleFontColor;
    Color TitleFontOutlineColor;

    String title1;
    String title2;

    double centralPositionX;
    double centralPositionY;

    double scaleValuePerPixel_Y;
    double valueScale;
    double valueScaleDecimal;
    double valueMinimal;

    double valuePositionY;
    double valueOffsetY;
    double valueFontSize;
    double valueScaleFontSize;
    double valueScalePositionX;
    double valueScalePositionY;
    Color valueColor;
    Alignment valueAlignment;

    double valueScalePositionY_Max;
    double valueScalePositionY_Min;

    Color valueScaleColor;

    Alignment valueScaleAlignment;

    double centralLinePositionOffsetX;
    double centralLinePositionOffsetY;
    double centralLineWidth;
    double centralLineThickness;
    Color centralLineColor;

    double valueLineOffsetX;
    double valueLineOffsetY;
    double valueLineWidth;
    double valueLineThickness;
    Color valueLineColor;
    double stepBig;

    double valueSmallLineOffsetX;
    double valueSmallLineOffsetY;
    double valueSmallLineWidth;
    double valueSmallLineThickness;
    Color valueSmallLineColor;
    double stepSmall;

    public BackgroundScript() {

        ScaleFontColor = ColorA;
        ScaleFontOutlineColor = ColorB;
        ScaleFontColor_Neg = ColorC;
        ScaleFontOutlineColor_Neg = ColorD;
        ScaleBigIntervalColor = ColorE;
        ScaleSmallIntervalColor = ColorF;
        TitleFontColor = ColorG;
        TitleFontOutlineColor = ColorH;
        ValueCentralLineColor = RED;

        title1 = "VERT";
        title2 = "m/s";

        SetTextOutline(TitleFontOutlineColor);
        DrawText(title1, 60, 240, TitleFontColor, 30, AlignH_Left);
        DrawText(title2, 60, 215, TitleFontColor, 30, AlignH_Left);

        centralPositionX = 0;
        centralPositionY = SizeY / 2;

        valueScale = 10;
        stepBig = 10;
        scaleValuePerPixel_Y = 7;

        valueScaleDecimal = 0;
        valueMinimal = -999999;

// Value format.
        valuePositionY = SizeY / 2;
        valueOffsetY = -5;
        valueFontSize = 40;
        valueScaleFontSize = 30;
        valueScalePositionX = 100;
        valueScalePositionY = 0;
        valueAlignment = AlignH_Right;

// Line of value format.
        centralLinePositionOffsetX = 50;
        centralLinePositionOffsetY = -21;
        centralLineWidth = 100;
        centralLineThickness = 2;
        centralLineColor = ValueCentralLineColor;

        valueScalePositionY_Max = SizeY - 10;
        valueScalePositionY_Min = 40;
        valueScaleColor = ScaleFontColor;
        valueScaleAlignment = AlignH_Left;

// Value big lines.
        valueLineOffsetX = -40;
        valueLineOffsetY = -21;
        valueLineWidth = 30;
        valueLineThickness = 3;
        valueLineColor = ScaleBigIntervalColor;

// Value small lines.
        valueSmallLineOffsetX = -40;
        valueSmallLineOffsetY = -21;
        valueSmallLineWidth = 10;
        valueSmallLineThickness = 2;
        valueSmallLineColor = ScaleSmallIntervalColor;
        stepSmall = stepBig / 5;
    }
}
