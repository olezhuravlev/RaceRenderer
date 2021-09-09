package RaceRenderer.Tape;

import RaceRenderer.Common.ForegroundVariables;

public class ForegroundScript extends BackgroundScript implements ForegroundVariables {

    double StartNum;
    int NoScroll;
    double MidNum;
    double EndNum;
    double OffsetY;
    double Num;
    double X;
    double Y;
    double V;
    double BoxX1;
    double BoxX2;
    double BoxY1;
    double BoxY2;

    public ForegroundScript() {

        //Choose a starting number that encourages the pointer to be in the middle
        StartNum = DataValue - (RangeNum / 2);
        NoScroll = 0;

        if(StartNum + RangeNum > DataMax && !DataMaxAuto) {
            StartNum = DataMax - RangeNum;
            NoScroll = 1;
        }

        if(StartNum < DataMin && !DataMinAuto) {
            StartNum = DataMin;
            NoScroll = 1;
        }

        // Align it to MarkInterval.
        StartNum = Floor(StartNum / MarkInterval) * MarkInterval;
        EndNum = StartNum + RangeNum;

        OffsetY = BaseOffsetY;
        if(NoScroll == 0) {
            MidNum = StartNum + (RangeNum / 2);
            OffsetY -= (DataValue - MidNum) * ScaleNum;
        }

        //Draw marks and numbers, starting from the bottom up.
        Num = StartNum;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        if(Y >= Pad + HalfNumSize && Num >= DataMin) {
            DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
            DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);
        }

        if(Y + HalfSpaceInterval >= Pad + MarkSmallSize && Num + HalfMarkInterval >= DataMin) {
            DrawLine(MarkX1, Y + HalfSpaceInterval, MarkX2, Y + HalfSpaceInterval, MarkColor, MarkSmallSize);
        }

        Num += MarkInterval;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
        DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);

        DrawLine(MarkX1, Y + HalfSpaceInterval, MarkX2, Y + HalfSpaceInterval, MarkColor, MarkSmallSize);

        Num += MarkInterval;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
        DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);

        DrawLine(MarkX1, Y + HalfSpaceInterval, MarkX2, Y + HalfSpaceInterval, MarkColor, MarkSmallSize);

        Num += MarkInterval;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
        DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);

        DrawLine(MarkX1, Y + HalfSpaceInterval, MarkX2, Y + HalfSpaceInterval, MarkColor, MarkSmallSize);

        Num += MarkInterval;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
        DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);

        DrawLine(MarkX1, Y + HalfSpaceInterval, MarkX2, Y + HalfSpaceInterval, MarkColor, MarkSmallSize);

        Num += MarkInterval;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
        DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);

        DrawLine(MarkX1, Y + HalfSpaceInterval, MarkX2, Y + HalfSpaceInterval, MarkColor, MarkSmallSize);

        Num += MarkInterval;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
        DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);

        if(Y + HalfSpaceInterval <= SizeY - (Pad + MarkSmallSize) && Num + HalfMarkInterval <= DataMax) {
            DrawLine(MarkX1, Y + HalfSpaceInterval, MarkX2, Y + HalfSpaceInterval, MarkColor, MarkSmallSize);
        }

        Num += MarkInterval;
        Y = OffsetY + ((Num - StartNum) * ScaleNum);
        if(Y + HalfNumSize <= SizeY - Pad && Num <= DataMax) {
            DrawLine(MarkX1, Y, MarkX2, Y, MarkColor, MarkSize);
            DrawNumber(Num, 0, NumX, Y + HalfNumSize, MarkColor, NumSize, 0);
        }

        // Draw the current number in a box.
        V = DataValue;
        if(V < StartNum) {
            V = StartNum;
        } else {
            if(V > EndNum) {
                V = EndNum;
            }
        }

        Y = OffsetY + ((V - StartNum) * ScaleNum);
        BoxX2 = SizeX - (Pad + TrimSize + BoxTrimSize + 6);
        BoxY1 = Y - HalfBoxHeight;
        BoxY2 = Y + HalfBoxHeight;

        // Draw box background.
        DrawRect(NumX, BoxY1, BoxX2, BoxY2, BackColor, Filled);

        // Draw box trim.
        DrawRect(NumX, BoxY1, BoxX2, BoxY2, BoxColor, BoxTrimSize);

        // Draw box pointer arrow on left.
        DrawPoly3(NumX - (MarkNumSpace * 0.8), Y, NumX, BoxY1 - BoxTrimSize, NumX, BoxY2 + BoxTrimSize, BoxColor, Filled);

        // Draw current value number in box.
        DrawNumber(DataValue, 0, NumX + BoxTrimSize + 8, Y + HalfBoxNumSize, NumColor, BoxNumSize, 0);
    }
}
