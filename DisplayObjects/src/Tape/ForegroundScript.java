package RaceRenderer.Tape;

import RaceRenderer.Common.ForegroundVariables;

public class ForegroundScript extends BackgroundScript implements ForegroundVariables {

    double value;

    double floorVal;

    double floor_plus_3;
    double floor_plus_3_plus_4;
    double floor_plus_3_plus_2;
    double floor_plus_3_minus_2;
    double floor_plus_3_minus_4;

    double floor_plus_2;
    double floor_plus_2_plus_4;
    double floor_plus_2_plus_2;
    double floor_plus_2_minus_2;
    double floor_plus_2_minus_4;

    double floor_plus_1;
    double floor_plus_1_plus_4;
    double floor_plus_1_plus_2;
    double floor_plus_1_minus_2;
    double floor_plus_1_minus_4;

    double floor_plus_0_plus_4;
    double floor_plus_0_plus_2;
    double floor_plus_0_minus_2;
    double floor_plus_0_minus_4;

    double floor_minus_2;
    double floor_minus_2_plus_4;
    double floor_minus_2_plus_2;
    double floor_minus_2_minus_2;
    double floor_minus_2_minus_4;

    double floor_minus_3;
    double floor_minus_3_plus_4;
    double floor_minus_3_plus_2;
    double floor_minus_3_minus_2;
    double floor_minus_3_minus_4;

    double valueToShow;
    double difference;

    Color fontColor;
    Color outlineColor;

    public ForegroundScript() {

        value = DataValue;
        //value = DataValue + 99;
        //value = 0;

        if(value < valueMinimal) {
            value = valueMinimal;
        }

        floorVal = Floor(value / valueScale) * valueScale;

        floor_plus_3 = floorVal + stepBig * 3;
        floor_plus_3_plus_4 = floor_plus_3 + stepSmall * 2;
        floor_plus_3_plus_2 = floor_plus_3 + stepSmall;
        floor_plus_3_minus_2 = floor_plus_3 - stepSmall;
        floor_plus_3_minus_4 = floor_plus_3 - stepSmall * 2;

        floor_plus_2 = floorVal + stepBig * 2;
        floor_plus_2_plus_4 = floor_plus_2 + stepSmall * 2;
        floor_plus_2_plus_2 = floor_plus_2 + stepSmall;
        floor_plus_2_minus_2 = floor_plus_2 - stepSmall;
        floor_plus_2_minus_4 = floor_plus_2 - stepSmall * 2;

        floor_plus_1 = floorVal + stepBig;
        floor_plus_1_plus_4 = floor_plus_1 + stepSmall * 2;
        floor_plus_1_plus_2 = floor_plus_1 + stepSmall;
        floor_plus_1_minus_2 = floor_plus_1 - stepSmall;
        floor_plus_1_minus_4 = floor_plus_1 - stepSmall * 2;

        floor_plus_0_plus_4 = floorVal + stepSmall * 2;
        floor_plus_0_plus_2 = floorVal + stepSmall;
        floor_plus_0_minus_2 = floorVal - stepSmall;
        floor_plus_0_minus_4 = floorVal - stepSmall * 2;

        floor_minus_2 = floorVal - stepBig;
        floor_minus_2_plus_4 = floor_minus_2 + stepSmall * 2;
        floor_minus_2_plus_2 = floor_minus_2 + stepSmall;
        floor_minus_2_minus_2 = floor_minus_2 - stepSmall;
        floor_minus_2_minus_4 = floor_minus_2 - stepSmall * 2;

        floor_minus_3 = floorVal - stepBig * 2;
        floor_minus_3_plus_4 = floor_minus_3 + stepSmall * 2;
        floor_minus_3_plus_2 = floor_minus_3 + stepSmall;
        floor_minus_3_minus_2 = floor_minus_3 - stepSmall;
        floor_minus_3_minus_4 = floor_minus_3 - stepSmall * 2;

// Draw scale values above central position.


//////////////////////////////////////////////////////////////////////////////////////
// Value +3+0.4.
        valueToShow = floor_plus_3_plus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +3+0.2.
        valueToShow = floor_plus_3_plus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +3.
        valueToShow = floor_plus_3;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            fontColor = ScaleFontColor;
            outlineColor = ScaleFontOutlineColor;
            if(valueToShow < 0) {
                fontColor = ScaleFontColor_Neg;
                outlineColor = ScaleFontOutlineColor_Neg;
            }
            SetTextOutline(outlineColor);
            DrawNumber(valueToShow, valueScaleDecimal, valueScalePositionX, valueScalePositionY + valueOffsetY, fontColor, valueScaleFontSize, valueScaleAlignment);
            DrawLine(valueScalePositionX + valueLineOffsetX, valueScalePositionY + valueLineOffsetY, valueScalePositionX + valueLineOffsetX + valueLineWidth, valueScalePositionY + valueLineOffsetY, valueLineColor, valueLineThickness);
        }

// Value +3-0.2.
        valueToShow = floor_plus_3_minus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +3-0.4.
        valueToShow = floor_plus_3_minus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

//////////////////////////////////////////////////////////////////////////////////////
// Value +2+0.4.
        valueToShow = floor_plus_2_plus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +2+0.2.
        valueToShow = floor_plus_2_plus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +2.
        valueToShow = floor_plus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            fontColor = ScaleFontColor;
            outlineColor = ScaleFontOutlineColor;
            if(valueToShow < 0) {
                fontColor = ScaleFontColor_Neg;
                outlineColor = ScaleFontOutlineColor_Neg;
            }
            SetTextOutline(outlineColor);
            DrawNumber(valueToShow, valueScaleDecimal, valueScalePositionX, valueScalePositionY + valueOffsetY, fontColor, valueScaleFontSize, valueScaleAlignment);
            DrawLine(valueScalePositionX + valueLineOffsetX, valueScalePositionY + valueLineOffsetY, valueScalePositionX + valueLineOffsetX + valueLineWidth, valueScalePositionY + valueLineOffsetY, valueLineColor, valueLineThickness);
        }

// Value +2-0.2.
        valueToShow = floor_plus_2_minus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +2-0.4.
        valueToShow = floor_plus_2_minus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

//////////////////////////////////////////////////////////////////////////////////////
// Value +1+0.4.
        valueToShow = floor_plus_1_plus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +1+0.2.
        valueToShow = floor_plus_1_plus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value + 1.
        valueToShow = floor_plus_1;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            fontColor = ScaleFontColor;
            outlineColor = ScaleFontOutlineColor;
            if(valueToShow < 0) {
                fontColor = ScaleFontColor_Neg;
                outlineColor = ScaleFontOutlineColor_Neg;
            }
            SetTextOutline(outlineColor);
            DrawNumber(valueToShow, valueScaleDecimal, valueScalePositionX, valueScalePositionY + valueOffsetY, fontColor, valueScaleFontSize, valueScaleAlignment);
            DrawLine(valueScalePositionX + valueLineOffsetX, valueScalePositionY + valueLineOffsetY, valueScalePositionX + valueLineOffsetX + valueLineWidth, valueScalePositionY + valueLineOffsetY, valueLineColor, valueLineThickness);
        }

// Value +1-0.2.
        valueToShow = floor_plus_1_minus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value +1-0.4.
        valueToShow = floor_plus_1_minus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

//////////////////////////////////////////////////////////////////////////////////////
// Value: draw current value at central position.
//        valueToShow = value;
//        difference = valueToShow - value;
//        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
//        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
//            DrawLine(centralPositionX + centralLinePositionOffsetX, centralPositionY + centralLinePositionOffsetY, centralPositionX + centralLinePositionOffsetX + centralLineWidth, centralPositionY + centralLinePositionOffsetY, centralLineColor, centralLineThickness);
//        }

//////////////////////////////////////////////////////////////////////////////////////
// Value floor: Draw scale values right below central position.

// Value 0+0.4.
        valueToShow = floor_plus_0_plus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value 0+0.2.
        valueToShow = floor_plus_0_plus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value 0 (floor);
        valueToShow = floorVal;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            fontColor = ScaleFontColor;
            outlineColor = ScaleFontOutlineColor;
            if(valueToShow < 0) {
                fontColor = ScaleFontColor_Neg;
                outlineColor = ScaleFontOutlineColor_Neg;
            }
            SetTextOutline(outlineColor);
            DrawNumber(valueToShow, valueScaleDecimal, valueScalePositionX, valueScalePositionY + valueOffsetY, fontColor, valueScaleFontSize, valueScaleAlignment);
            DrawLine(valueScalePositionX + valueLineOffsetX, valueScalePositionY + valueLineOffsetY, valueScalePositionX + valueLineOffsetX + valueLineWidth, valueScalePositionY + valueLineOffsetY, valueLineColor, valueLineThickness);
        }

// Value 0-0.2.
        valueToShow = floor_plus_0_minus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value 0-0.4.
        valueToShow = floor_plus_0_minus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

//////////////////////////////////////////////////////////////////////////////////////
// Value -2+0.4.
        valueToShow = floor_minus_2_plus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value -2+0.2.
        valueToShow = floor_minus_2_plus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value -2.
        valueToShow = floor_minus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            fontColor = ScaleFontColor;
            outlineColor = ScaleFontOutlineColor;
            if(valueToShow < 0) {
                fontColor = ScaleFontColor_Neg;
                outlineColor = ScaleFontOutlineColor_Neg;
            }
            SetTextOutline(outlineColor);
            DrawNumber(valueToShow, valueScaleDecimal, valueScalePositionX, valueScalePositionY + valueOffsetY, fontColor, valueScaleFontSize, valueScaleAlignment);
            DrawLine(valueScalePositionX + valueLineOffsetX, valueScalePositionY + valueLineOffsetY, valueScalePositionX + valueLineOffsetX + valueLineWidth, valueScalePositionY + valueLineOffsetY, valueLineColor, valueLineThickness);
        }

// Value -2-0.2.
        valueToShow = floor_minus_2_minus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value -2-0.4.
        valueToShow = floor_minus_2_minus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

//////////////////////////////////////////////////////////////////////////////////////
// Value -3+0.4.
        valueToShow = floor_minus_3_plus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value -3+0.2.
        valueToShow = floor_minus_3_plus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value -3.
        valueToShow = floor_minus_3;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            fontColor = ScaleFontColor;
            outlineColor = ScaleFontOutlineColor;
            if(valueToShow < 0) {
                fontColor = ScaleFontColor_Neg;
                outlineColor = ScaleFontOutlineColor_Neg;
            }
            SetTextOutline(outlineColor);
            DrawNumber(valueToShow, valueScaleDecimal, valueScalePositionX, valueScalePositionY + valueOffsetY, fontColor, valueScaleFontSize, valueScaleAlignment);
            DrawLine(valueScalePositionX + valueLineOffsetX, valueScalePositionY + valueLineOffsetY, valueScalePositionX + valueLineOffsetX + valueLineWidth, valueScalePositionY + valueLineOffsetY, valueLineColor, valueLineThickness);
        }

// Value -3-0.2.
        valueToShow = floor_minus_3_minus_2;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }

// Value -3-0.4.
        valueToShow = floor_minus_3_minus_4;
        difference = valueToShow - value;
        valueScalePositionY = centralPositionY + difference * scaleValuePerPixel_Y;
        if(valueToShow >= valueMinimal && valueScalePositionY_Min < valueScalePositionY && valueScalePositionY < valueScalePositionY_Max) {
            DrawLine(valueScalePositionX + valueSmallLineOffsetX, valueScalePositionY + valueSmallLineOffsetY, valueScalePositionX + valueSmallLineOffsetX + valueSmallLineWidth, valueScalePositionY + valueSmallLineOffsetY, valueSmallLineColor, valueSmallLineThickness);
        }
    }
}
