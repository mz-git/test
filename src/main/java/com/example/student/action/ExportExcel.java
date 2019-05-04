package com.example.student.action;

/**
 * EXCEL报表工具类.
 *
 * @author caoyb
 * @version $Revision:$
 */

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.Region;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExportExcel {
    private HSSFWorkbook wb = null;
    private HSSFSheet sheet = null;

    /**
     * 31      * @param wb
     * 32      * @param sheet
     * 33
     */
    public ExportExcel(HSSFWorkbook wb, HSSFSheet sheet) {
        super();
        this.wb = wb;
        this.sheet = sheet;
    }

    /**
     * 41      * @return the sheet
     * 42
     */
    public HSSFSheet getSheet() {
        return sheet;
    }

    /**
     * 48      * @param sheet
     * 49      *            the sheet to set
     * 50
     */
    public void setSheet(HSSFSheet sheet) {
        this.sheet = sheet;
    }

    /**
     * 56      *@return the wb
     * 57
     */
    public HSSFWorkbook getWb() {
        return wb;
    }

    /**
     * 63      * @param wb
     * 64      *            the wb to set
     * 65
     */
    public void setWb(HSSFWorkbook wb) {
        this.wb = wb;
    }

    /**
     * 71      * 创建通用EXCEL头部
     * 72      *
     * 73      * @param headString
     * 74      *            头部显示的字符
     * 75      * @param colSum
     * 76      *            该报表的列数
     * 77
     */
    public void createNormalHead(String headString, int colSum) {

        HSSFRow row = sheet.createRow(0);

        // 设置第一行
        HSSFCell cell = row.createCell(0);
        row.setHeight((short) 400);

        // 定义单元格为字符串类型
        cell.setCellType(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue(new HSSFRichTextString("南京城区各网点进件统计报表"));

        // 指定合并区域
        sheet.addMergedRegion(new Region(0, (short) 0, 0, (short) colSum));

        HSSFCellStyle cellStyle = wb.createCellStyle();

        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 设置单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 300);
        cellStyle.setFont(font);

        cell.setCellStyle(cellStyle);
    }

    /**
     * 110      * 创建通用报表第二行
     * 111      *
     * 112      * @param params
     * 113      *            统计条件数组
     * 114      * @param colSum
     * 115      *            需要合并到的列索引
     * 116
     */


    public void createNormalTwoRow(String[] params, int colSum) {
        HSSFRow row1 = sheet.createRow(1);
        row1.setHeight((short) 300);

        HSSFCell cell2 = row1.createCell(0);

        cell2.setCellType(HSSFCell.ENCODING_UTF_16);
        cell2.setCellValue(new HSSFRichTextString("统计时间：" + params[0] + "至"
                 + params[1]));

        // 指定合并区域
        sheet.addMergedRegion(new Region(1, (short) 0, 1, (short) colSum));

        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 设置单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 250);
        cellStyle.setFont(font);

        cell2.setCellStyle(cellStyle);

    }


    /**
     * 147      * 设置报表标题
     * 148      *
     * 149      * @param columHeader
     * 150      *            标题字符串数组
     * 151
     */
    public void createColumHeader(String[] columHeader) {

        // 设置列头
        HSSFRow row2 = sheet.createRow(2);

        // 指定行高
        row2.setHeight((short) 600);

        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 250);
        cellStyle.setFont(font);

                 /*
173          * cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单无格的边框为粗体
174          * cellStyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色．
175          * cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
176          * cellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
177          * cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
178          * cellStyle.setRightBorderColor(HSSFColor.BLACK.index);
179          * cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
180          * cellStyle.setTopBorderColor(HSSFColor.BLACK.index);
181          */

        // 设置单元格背景色
        cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
        cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        HSSFCell cell3 = null;

        for (int i = 0; i < columHeader.length; i++) {
            cell3 = row2.createCell(i);
            cell3.setCellType(HSSFCell.ENCODING_UTF_16);
            cell3.setCellStyle(cellStyle);
            cell3.setCellValue(new HSSFRichTextString(columHeader[i]));
        }

    }

    /**
     * 199      * 创建内容单元格
     * 200      *
     * 201      * @param wb
     * 202      *            HSSFWorkbook
     * 203      * @param row
     * 204      *            HSSFRow
     * 205      * @param col
     * 206      *            short型的列索引
     * 207      * @param align
     * 208      *            对齐方式
     * 209      * @param val
     * 210      *            列值
     * 211
     */
    public void cteateCell(HSSFWorkbook wb, HSSFRow row, int col, short align,
                           String val) {
        HSSFCell cell = row.createCell(col);
        cell.setCellType(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue(new HSSFRichTextString(val));
        HSSFCellStyle cellstyle = wb.createCellStyle();
        cellstyle.setAlignment(align);
        cell.setCellStyle(cellstyle);
    }

    /**
     * 223      * 创建合计行
     * 224      *
     * 225      * @param colSum
     * 226      *            需要合并到的列索引
     * 227      * @param cellValue
     * 228
     */
    public void createLastSumRow(int colSum, String[] cellValue) {

        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 250);
        cellStyle.setFont(font);

        HSSFRow lastRow = sheet.createRow((short) (sheet.getLastRowNum() + 1));
        HSSFCell sumCell = lastRow.createCell(0);

        sumCell.setCellValue(new HSSFRichTextString("合计"));
        sumCell.setCellStyle(cellStyle);
        sheet.addMergedRegion(new Region(sheet.getLastRowNum(), (short) 0,
                sheet.getLastRowNum(), (short) colSum));// 指定合并区域

        for (int i = 2; i < (cellValue.length + 2); i++) {
            sumCell = lastRow.createCell(i);
            sumCell.setCellStyle(cellStyle);
            sumCell.setCellValue(new HSSFRichTextString(cellValue[i - 2]));

        }

    }

    /**
     * 261      * 输入EXCEL文件
     * 262      *
     * 263      * @param fileName
     * 264      *            文件名
     * 265
     */
    public void outputExcel(String fileName) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(fileName));
            wb.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}