package co.smartreceipts.android.settings.widget;

import android.content.Context;
import android.support.v7.app.ActionBar;

import javax.inject.Inject;

import co.smartreceipts.android.R;
import co.smartreceipts.android.model.impl.columns.receipts.ReceiptColumnDefinitions;
import co.smartreceipts.android.persistence.database.controllers.impl.ColumnTableController;
import dagger.android.support.AndroidSupportInjection;

public class PDFColumnsListFragment extends ColumnsListFragment {

    public static String TAG = "PDFColumnsListFragment";


    @Inject
    ReceiptColumnDefinitions receiptColumnDefinitions;

    public static ColumnsListFragment newInstance() {
        return new PDFColumnsListFragment();
    }

    @Override
    protected ColumnTableController getColumnTableController() {
        return getSmartReceiptsApplication().getTableControllerManager().getPDFTableController();
    }

    @Override
    protected ReceiptColumnDefinitions getReceiptColumnDefinitions() {
        return receiptColumnDefinitions;
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public void onResume() {
        super.onResume();
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            getSupportActionBar().setTitle(R.string.menu_main_pdf);
        }
    }

}
