package cn.nurasoft.zero.VBNet;


import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;



/*
 * Created by Administrator on 22/02/2018.
 */

public class Tutorial_Activity extends Activity {

    PDFView pdfView;
    DataBaseHelperClass helperClass;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_view);

        pdfView = findViewById(R.id.pdfview);

        helperClass = new DataBaseHelperClass(Tutorial_Activity.this);

        db = helperClass.getReadableDatabase();

        Bundle bundle = this.getIntent().getExtras();

        String s = bundle.getString("sub");

        helperClass.openDataBase();
        //pdfView.fromAsset("pdf/vb.pdf").load();
        pdfView.fromBytes(helperClass.get_File(s))
                //.pages(0) // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                // allows to draw something on the current page, usually visible in the middle of the screen
                // .onDraw(onDrawListener)
                // allows to draw something on all pages, separately for every page. Called only for visible pages
                // .onDrawAll(onDrawListener)
                // .onLoad(onLoadCompleteListener) // called after document is loaded and starts to be rendered
                // .onPageChange(onPageChangeListener)
                // .onPageScroll(onPageScrollListener)
                // .onError(onErrorListener)
                // .onPageError(onPageErrorListener)
                // .onRender(onRenderListener) // called after document is rendered for the first time
                // called on single tap, return true if handled, false to toggle scroll handle visibility
                //  .onTap(onTapListener)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                //  .linkHandler(DefaultLinkHandler)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();
        helperClass.close();

    }


}

