package RaceRenderer.Tape;

import RaceRenderer.Common.Functions;

import static RaceRenderer.Common.CommonVariables.Alignment.AlignH_Left;
import static RaceRenderer.Common.CommonVariables.Alignment.AlignH_Right;
import static RaceRenderer.Common.CommonVariables.Color.WHITE;

public class BackgroundScript implements Functions {

    Color ValueFontColor;
    Color ValueFontOutlineColor;
    Color ValueBoxColor;
    Color ValueLineColor;
    Color ScaleFontColor;
    Color ScaleFontOutlineColor;
    Color ScaleBigIntervalColor;
    Color ScaleSmallIntervalColor;

    String title;

    double centralPositionY;

    double scaleValuePerPixel_Y;
    double valueScale;
    double valueScaleDecimal;
    double valueMinimal;

    double valuePositionX;
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

    double boxWidth;
    double boxHeight;
    double boxOffsetX;
    double boxOffsetY;
    double boxThickness;
    Color boxColor;
    double boxLineOffsetX;
    double boxLineOffsetY;
    double boxLineWidth;
    double boxLineThickness;
    Color boxLineColor;

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

        ValueFontColor = ColorA;
        ValueFontOutlineColor = ColorB;
        ValueBoxColor = ColorC;
        ValueLineColor = ColorC;
        ScaleFontColor = ColorD;
        ScaleFontOutlineColor = ColorE;
        ScaleBigIntervalColor = ColorF;
        ScaleSmallIntervalColor = ColorG;

        title = "ALT,m";
        SetTextOutline(WHITE);
        DrawText(title, 0, 550, WHITE, 35, AlignH_Left);

        centralPositionY = SizeY / 2;

        scaleValuePerPixel_Y = 18;
        valueScale = 10;
        valueScaleDecimal = 0;
        valueMinimal = 0;

        // Value format.
        valuePositionX = 130;
        valuePositionY = SizeY / 2;
        valueOffsetY = -5;
        valueFontSize = 40;
        valueScaleFontSize = 30;
        valueScalePositionX = 240;
        valueScalePositionY = 5;
        valueColor = ValueFontColor;
        valueAlignment = AlignH_Right;

        valueScalePositionY_Max = SizeY - 10;
        valueScalePositionY_Min = 40;
        valueScaleColor = ScaleFontColor;
        valueScaleAlignment = AlignH_Right;

        // Value big lines.
        valueLineOffsetX = 10;
        valueLineOffsetY = -21;
        valueLineWidth = 30;
        valueLineThickness = 4;
        valueLineColor = ValueLineColor;
        stepBig = 10;

        // Value small lines.
        valueSmallLineOffsetX = 26;
        valueSmallLineOffsetY = -21;
        valueSmallLineWidth = 10;
        valueSmallLineThickness = 2;
        valueSmallLineColor = ValueLineColor;
        stepSmall = stepBig / 5;

        // Box around value format.
        boxWidth = 8;
        boxHeight = 50;
        boxOffsetX = -130;
        boxOffsetY = 10;
        boxThickness = 2;
        boxColor = ValueBoxColor;
        boxLineOffsetX = boxWidth - 5;
        boxLineOffsetY = boxHeight / 2 * -1 + 3;
        boxLineWidth = 200;
        boxLineThickness = 1;
        boxLineColor = ValueBoxColor;
    }
}
