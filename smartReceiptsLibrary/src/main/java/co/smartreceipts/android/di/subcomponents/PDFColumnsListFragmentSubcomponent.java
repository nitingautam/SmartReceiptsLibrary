package co.smartreceipts.android.di.subcomponents;

import co.smartreceipts.android.di.FragmentScope;
import co.smartreceipts.android.settings.widget.PDFColumnsListFragment;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@FragmentScope
@Subcomponent
public interface PDFColumnsListFragmentSubcomponent extends AndroidInjector<PDFColumnsListFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PDFColumnsListFragment> {

    }
}
