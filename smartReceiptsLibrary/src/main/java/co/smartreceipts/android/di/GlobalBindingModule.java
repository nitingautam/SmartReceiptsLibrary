package co.smartreceipts.android.di;

import android.app.Activity;
import android.support.v4.app.Fragment;

import co.smartreceipts.android.activities.SmartReceiptsActivity;
import co.smartreceipts.android.di.subcomponents.BackupsFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.CSVColumnsListFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.DeleteRemoteBackupProgressDialogFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.DistanceDialogFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.DistanceFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.DownloadRemoteBackupImagesProgressDialogFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.ExportBackupWorkerProgressDialogFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.GenerateReportFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.ImportLocalBackupWorkerProgressDialogFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.ImportRemoteBackupWorkerProgressDialogFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.InformAboutPdfImageAttachmentDialogFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.PDFColumnsListFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.ReceiptCreateEditFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.ReceiptImageFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.ReceiptsListFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.SettingsActivitySubcomponent;
import co.smartreceipts.android.di.subcomponents.SmartReceiptsActivitySubcomponent;
import co.smartreceipts.android.di.subcomponents.TripCreateEditFragmentSubcomponent;
import co.smartreceipts.android.di.subcomponents.TripFragmentSubcomponent;
import co.smartreceipts.android.fragments.DistanceDialogFragment;
import co.smartreceipts.android.fragments.DistanceFragment;
import co.smartreceipts.android.fragments.GenerateReportFragment;
import co.smartreceipts.android.fragments.InformAboutPdfImageAttachmentDialogFragment;
import co.smartreceipts.android.fragments.ReceiptCreateEditFragment;
import co.smartreceipts.android.fragments.ReceiptImageFragment;
import co.smartreceipts.android.fragments.ReceiptsListFragment;
import co.smartreceipts.android.settings.widget.CSVColumnsListFragment;
import co.smartreceipts.android.settings.widget.PDFColumnsListFragment;
import co.smartreceipts.android.settings.widget.SettingsActivity;
import co.smartreceipts.android.sync.widget.backups.BackupsFragment;
import co.smartreceipts.android.sync.widget.backups.DeleteRemoteBackupProgressDialogFragment;
import co.smartreceipts.android.sync.widget.backups.DownloadRemoteBackupImagesProgressDialogFragment;
import co.smartreceipts.android.sync.widget.backups.ExportBackupWorkerProgressDialogFragment;
import co.smartreceipts.android.sync.widget.backups.ImportLocalBackupWorkerProgressDialogFragment;
import co.smartreceipts.android.sync.widget.backups.ImportRemoteBackupWorkerProgressDialogFragment;
import co.smartreceipts.android.trips.TripFragment;
import co.smartreceipts.android.trips.editor.TripCreateEditFragment;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
        subcomponents = {
                SmartReceiptsActivitySubcomponent.class,
                SettingsActivitySubcomponent.class,
                TripFragmentSubcomponent.class,
                TripCreateEditFragmentSubcomponent.class,
                ReceiptCreateEditFragmentSubcomponent.class,
                ReceiptImageFragmentSubcomponent.class,
                CSVColumnsListFragmentSubcomponent.class,
                PDFColumnsListFragmentSubcomponent.class,
                GenerateReportFragmentSubcomponent.class,
                ReceiptsListFragmentSubcomponent.class,
                DistanceFragmentSubcomponent.class,
                DistanceDialogFragmentSubcomponent.class,
                InformAboutPdfImageAttachmentDialogFragmentSubcomponent.class,
                BackupsFragmentSubcomponent.class,
                DeleteRemoteBackupProgressDialogFragmentSubcomponent.class,
                DownloadRemoteBackupImagesProgressDialogFragmentSubcomponent.class,
                ExportBackupWorkerProgressDialogFragmentSubcomponent.class,
                ImportLocalBackupWorkerProgressDialogFragmentSubcomponent.class,
                ImportRemoteBackupWorkerProgressDialogFragmentSubcomponent.class
        }
)
public abstract class GlobalBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(SmartReceiptsActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity> smartReceiptsActivitySubcomponentBuilder(
            SmartReceiptsActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(SettingsActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity> settingsActivitySubcomponentBuilder(
            SettingsActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(TripFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> tripFragmentSubcomponentBuilder(
            TripFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(TripCreateEditFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> tripCreateEditFragmentSubcomponentBuilder(
            TripCreateEditFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ReceiptCreateEditFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> receiptCreateEditFragmentSubcomponentBuilder(
            ReceiptCreateEditFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ReceiptImageFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> receiptImageFragmentSubcomponentBuilder(
            ReceiptImageFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ReceiptsListFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> receiptsListFragmentSubcomponentBuilder(
            ReceiptsListFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(CSVColumnsListFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> csvColumnListFragmentSubcomponentBuilder(
            CSVColumnsListFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(PDFColumnsListFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> pdfColumnListFragmentSubcomponentBuilder(
            PDFColumnsListFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(GenerateReportFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> generateReportFragmentSubcomponentBuilder(
            GenerateReportFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(DistanceFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> distanceFragmentBuilder(
            DistanceFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(DistanceDialogFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> distanceDialogFragmentBuilder(
            DistanceDialogFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(InformAboutPdfImageAttachmentDialogFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> informDialogBuilder(
            InformAboutPdfImageAttachmentDialogFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(BackupsFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> backupsFragmentBuilder(
            BackupsFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(DeleteRemoteBackupProgressDialogFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> deleteRemoteBackupProgressFragmentBuilder(
            DeleteRemoteBackupProgressDialogFragmentSubcomponent.Builder builder);


    @Binds
    @IntoMap
    @FragmentKey(DownloadRemoteBackupImagesProgressDialogFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> downloadRemoteBackupImagesProgressFragmentBuilder(
            DownloadRemoteBackupImagesProgressDialogFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ExportBackupWorkerProgressDialogFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> exportBackupWorkerProgressDialogFragmentBuilder(
            ExportBackupWorkerProgressDialogFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ImportLocalBackupWorkerProgressDialogFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> importLocalBackupWorkerProgressDialogFragmentBuilder(
            ImportLocalBackupWorkerProgressDialogFragmentSubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ImportRemoteBackupWorkerProgressDialogFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> importRemoteBackupWorkerProgressDialogFragmentBuilder(
            ImportRemoteBackupWorkerProgressDialogFragmentSubcomponent.Builder builder);


}
