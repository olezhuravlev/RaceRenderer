package RaceRenderer.Tape;

import RaceRenderer.Common.CommonVariables;

public class BackgroundScript implements CommonVariables {

    boolean IsTransparent;

    double TrimSize;
    double MarkInterval;
    double MarkSize;
    double MarkSmallSize;
    double MarkLeftOffset;
    double MarkWidth;
    double MarkNumSpace;
    double NumSize;
    double BoxTrimSize;
    double BoxNumSize;
    double HalfMarkInterval;
    double HalfBoxNumSize;
    double HalfNumSize;
    double HalfBoxHeight;
    double Pad;
    double SpaceY;
    double Marks;
    double SpaceInterval;
    double MarkX1;
    double MarkX2;
    double NumX;
    double HalfSpaceInterval;
    double BaseOffsetY;
    double RangeNum;
    double ScaleNum;

    Color BackColor;
    Color TrimColor;
    Color MarkColor;
    Color BoxColor;
    Color NumColor;

    public BackgroundScript() {

        // If set to true, background and outer trim will not be drawn.
        IsTransparent = true;

        // Colors, Sizes, and Spacings.
        BackColor = ColorA;
        TrimColor = ColorB;
        MarkColor = ColorC;
        BoxColor = ColorD;
        NumColor = ColorE;

        // Outer trim thickness.
        TrimSize = 4;

        // Number marking interval (set 0 for automatic).
        MarkInterval = 0;

        // Normal mark size.
        MarkSize = 5;

        // Intermediate mark size.
        MarkSmallSize = 3;

        // Distance between left edge and mark dash.
        MarkLeftOffset = 30;

        // Width of mark dash.
        MarkWidth = 25;

        // Distance between mark dash and its number label.
        MarkNumSpace = 35;

        // Font size for mark numbers.
        NumSize = 52;

        // Number box trim thickness.
        BoxTrimSize = 2;

        // Relative size of number displayed in box.
        BoxNumSize = NumSize * 0.90;

        HalfMarkInterval = MarkInterval / 2;
        HalfBoxNumSize = BoxNumSize / 2;
        HalfNumSize = NumSize / 2;

        // Relative size of number box.
        HalfBoxHeight = HalfNumSize * 1.2;

        Pad = 8 + TrimSize;
        SpaceY = SizeY - (Pad * 2);

        // Now figure out how much display space will be between each mark interval.
        // Can't change this without also changing drawing code.
        Marks = 7;
        SpaceInterval = SpaceY / Marks;

        // Automatic numbering interval.
        if(MarkInterval <= 0) {
            if(DataRange > Marks * 1000) {
                MarkInterval = 1000;
            } else {
                if(DataRange > Marks * 100) {
                    MarkInterval = 100;
                } else {
                    if(DataRange > Marks * 10) {
                        MarkInterval = 10;
                    } else {
                        MarkInterval = 1;
                    }
                }
            }
        }


        // Draw the background.
        if(!IsTransparent) {
            DrawRect(Pad, Pad, SizeX - Pad, SizeY - Pad, BackColor, Filled);
        }

        // Draw trim around it.
        if(!IsTransparent) {
            DrawRect(Pad, Pad, SizeX - Pad, SizeY - Pad, TrimColor, TrimSize);
        }

        // Setup calcs for drawing marks and numbers.
        // Mark's offset from left edge.
        MarkX1 = Pad + MarkLeftOffset;

        // Mark width.
        MarkX2 = MarkX1 + MarkWidth;

        // Number's offset from mark.
        NumX = MarkX2 + MarkNumSpace;
        HalfSpaceInterval = SpaceInterval / 2;

        BaseOffsetY = Pad + HalfSpaceInterval;

        RangeNum = MarkInterval * (Marks - 1);
        ScaleNum = SpaceInterval / MarkInterval;
    }
}
