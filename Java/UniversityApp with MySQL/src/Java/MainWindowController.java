package Java;

import java.io.*;
import java.net.MalformedURLException;
import java.sql.*;
import java.util.*;

import additionalClasses.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class MainWindowController {

    @FXML
    private TextField profileTelephone_field;

    @FXML
    private Pane editProfilePanel;

    @FXML
    private TextField profileName_field;

    @FXML
    private TextField profilePosition_field;

    @FXML
    private TextField profileDegree_field;

    @FXML
    private TextField profilesecName_field;

    @FXML
    private TextField profilesurName_field;

    @FXML
    private Button edit_final_btn;

    @FXML
    private Button backBtn_profile;

    @FXML
    private ImageView imageditProfile;

    @FXML
    private Button uploadImageProfile_btn;

    @FXML
    private Button emp_prev_btn;

    @FXML
    private Button emp_next_btn;

    @FXML
    private Button close_Employees;

    @FXML
    private Label tel_emp;

    @FXML
    private Label pos_emp;

    @FXML
    private Label degree_emp;

    @FXML
    private ImageView img_emp;

    @FXML
    private Label name_emp;

    @FXML
    private Label sur_emp;

    @FXML
    private Label sec_emp;

    @FXML
    private Pane employees_panel;

    @FXML
    private Button employee_btn;

    @FXML
    private ComboBox<String> diplom_Student_Combo;

    @FXML
    private ComboBox<String> diplom_Group_Combo;

    @FXML
    private TextField diplom_Theme_field;

    @FXML
    private ComboBox<String> diplom_Teacher_Combo;

    @FXML
    private Button hide_btn_Diplom;

    @FXML
    private Button add_editDiplom_btn;

    @FXML
    private Pane edit_add_Diplom_Panel;

    @FXML
    private Pane studentDiplomPanel;

    @FXML
    private Button closeDiplom_btn;

    @FXML
    private TableView<TableList> diplomStudent_table;
    
    @FXML
    private TableColumn<TableList, String> diplomStudent_col;

    @FXML
    private TableColumn<TableList, String> diplomTeacher_col;

    @FXML
    private TableColumn<TableList, String> diplomGroup_col;

    @FXML
    private TableColumn<TableList, String> diplomTheme_col;

    @FXML
    private Button addNewDiplom_btn;

    @FXML
    private Button editDiplom_btn;

    @FXML
    private Button deleteDiplom_btn;

    @FXML
    private Button diplomaWork_btn;

    @FXML
    private Button editProfile;

    @FXML
    private ImageView photoUser;

    @FXML
    private Button delete_schedule_btn;

    @FXML
    private Button edit_Schedule_btn;

    @FXML
    private Button add_Shedule_btn;

    @FXML
    private TabPane tabSchedule;

    @FXML
    private TextField numberField_schedule;

    @FXML
    private TextField classField_schedule;

    @FXML
    private ComboBox<String> subjectsComboBox_schedule;

    @FXML
    private Button add_edit_btn_schedule;

    @FXML
    private Button hide_btn_schedule;

    @FXML
    private Pane editPanel_schedule;

    @FXML
    private Button schedule_btn;

    @FXML
    private Label scheduleLabel;

    @FXML
    private Pane schedulePanel;

    @FXML
    private TableView<TableList> tableMonday;

    @FXML
    private TableView<TableList> tableTuseday;

    @FXML
    private TableView<TableList> tableWednesday;

    @FXML
    private TableView<TableList> tableThursday;

    @FXML
    private TableView<TableList> tableFriday;

    @FXML
    private TableColumn<TableList, String> subjnumberCol_Friday;

    @FXML
    private TableColumn<TableList, String> subjnameCol_Friday;

    @FXML
    private TableColumn<TableList, String> classCol_Friday;

    @FXML
    private TableColumn<TableList, String> subjnumberCol_Thursday;

    @FXML
    private TableColumn<TableList, String> subjnameCol_Thursday;

    @FXML
    private TableColumn<TableList, String> classCol_Thursday;

    @FXML
    private TableColumn<TableList, String> classCol_Wednesday;

    @FXML
    private TableColumn<TableList, String> subjnameCol_Wednesday;

    @FXML
    private TableColumn<TableList, String> subjnumberCol_Wednesday;

    @FXML
    private TableColumn<TableList, String> classCol_Tuesday;

    @FXML
    private TableColumn<TableList, String> subjnameCol_Tuesday;

    @FXML
    private TableColumn<TableList, String> subjnumberCol_Tuseday;

    @FXML
    private TableColumn<TableList, String> classCol_Monday;

    @FXML
    private TableColumn<TableList, String> subjnameCol_Monday;

    @FXML
    private TableColumn<TableList, String> subjnumberCol_Monday;

    @FXML
    private Button closeSchedule;

    @FXML
    private Button schedule_next_btn;

    @FXML
    private Button schedule_prev_btn;

    @FXML
    private Pane graduateStudent_panel;

    @FXML
    private Button asp_prev_btn;

    @FXML
    private Button asp_next_btn;

    @FXML
    private Label asp_surnname;

    @FXML
    private Label asp_name;

    @FXML
    private Label asp_secname;

    @FXML
    private Label asp_surviser;

    @FXML
    private Label asp_sci_dir;

    @FXML
    private Label asp_theme;

    @FXML
    private Button closeAsp_btn;

    @FXML
    private Button asp_change_btn;

    @FXML
    private Button add_asp_btn;

    @FXML
    private Button delete_asp_btn;

    @FXML
    private Pane asp_panel_edit;

    @FXML
    private TextArea asp_editTheme_Field;

    @FXML
    private TextArea asp_edit_Sci_dir_Field;

    @FXML
    private TextField asp_secnameFiled;

    @FXML
    private ComboBox<String> asp_ComboBox;

    @FXML
    private TextField asp_surnameFiled;

    @FXML
    private TextField asp_nameFiled;

    @FXML
    private Button edit_asp_btn;

    @FXML
    private Button asp_hidePan_btn;

    @FXML
    private Label name_label;

    @FXML
    private Label degree_label;

    @FXML
    private Button exitMainW_btn;

    @FXML
    private Button graduateStudent_btn;

    @FXML
    private Button group_btn;

    @FXML
    private Pane group_panel;

    @FXML
    private Label label_groups;

    @FXML
    private Button group_next_btn;

    @FXML
    private Button group_prev_btn;

    @FXML
    private Button closeGroup_btn;

    @FXML
    private Button addGroup_btn;

    @FXML
    private Button editGroup_btn;

    @FXML
    private Button deleteGroup_btn;

    @FXML
    private Pane add_editPanel;

    @FXML
    private TextField add_edit_nameField;

    @FXML
    private TextField add_edit_surnnameField;

    @FXML
    private Button add_edit_Hide_btn;

    @FXML
    private Button add_edit_Final_btn;

    @FXML
    private Button syllabus_btn;

    @FXML
    private TextField add_edit_secnameField;


    @FXML
    private TableView<TableList> groups_table;

    @FXML
    private TableColumn<TableList, String> id_group;

    @FXML
    private TableColumn<TableList, String> surname_group;

    @FXML
    private TableColumn<TableList, String> name_group;

    @FXML
    private TableColumn<TableList, String> secname_group;

    @FXML
    private Pane add_editPanel_syllabus;

    @FXML
    private TextField add_edit_subjectField;

    @FXML
    private Button add_edit_Final_btn1;

    @FXML
    private TextField add_edit_hoursField;

    @FXML
    private Button add_edit_Hide_btn1;

    @FXML
    private TextField add_edit_examField;

    @FXML
    private TableView<TableList> syllabus;

    @FXML
    private TableColumn<TableList, String> subject;

    @FXML
    private TableColumn<TableList, String> nameTeacher;

    @FXML
    private TableColumn<TableList, String> hours;

    @FXML
    private TableColumn<TableList, String> exam;

    @FXML
    private ComboBox<String> add_edit_teacherComboBox;


    private DatabaseHandler db = new DatabaseHandler();
    private User user_main = new User();
    private User user;
    private TableList tableList;// ???????????? ?????? ?????????????????? ?????????? ???? ?????????????? ?? ???????????? onTableSelectItem()
    private Stage stage;

    private String ID;// ????????????, ???? ?????????????? ???????????????? ID ??????????????????????, ???? ?????????????? ???? ???????????????? get/set
    private ArrayList<User> user_list = new ArrayList<>();// ?????????? ?????? ???????????????????? ?????????? ???????????????????? ?? ??????????????????????
    private int counterAspirants = 0;// ?????????????????? ?????? ???????????????????????? ?????????? ????????????????????
    private ObservableList<TableList> group_list = FXCollections.observableArrayList();
    private ObservableList<TableList> monday_list = FXCollections.observableArrayList();
    private ObservableList<TableList> tuesday_list = FXCollections.observableArrayList();
    private ObservableList<TableList> wednesday_list = FXCollections.observableArrayList();
    private ObservableList<TableList> thursday_list = FXCollections.observableArrayList();
    private ObservableList<TableList> friday_list = FXCollections.observableArrayList();

    ArrayList<String> groupsName_list = new ArrayList<>();

    private NewScene newScene = new NewScene();
    private String key;// ???????????? ?????? ???????????????????????? ?????????????????? ??????????????

    private boolean imgchanger = false;// ???????????? ?????? ???????????????????????? ???????????????????? ????????????????????

    private PreparedStatement store;
    FileChooser fileChooser;
    File file;
    String img_action = "UPDATE";

    // ?????????? ???????????????????????? ?? ?????????? NewScene, ?????? ???????????????????? ????'?????? ?????? ?????????????? ???? ?????????????????? ??????????
    public void setStage(Stage stage){
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }

    public void setID(String ID){
        this.ID = ID;
        realInitForm();
    }

    public String getID(){
        return ID;
    }

    @FXML
    void initialize() {

        add_edit_teacherComboBox.setItems(FXCollections.observableArrayList(getData("??????????????????")));
        asp_ComboBox.setItems(FXCollections.observableArrayList(getData("??????????????????")));
        subjectsComboBox_schedule.setItems(FXCollections.observableArrayList(getData("????????????????")));
        diplom_Group_Combo.setItems(FXCollections.observableArrayList(getData("??????????")));
        diplom_Teacher_Combo.setItems(FXCollections.observableArrayList(getData("??????????????????")));
        diplom_Student_Combo.setItems(FXCollections.observableArrayList(getData("????????????????")));

        exitMainW_btn.setOnAction(event -> {
            Stage stagethis = (Stage) exitMainW_btn.getScene().getWindow();
            stagethis.close();
            getStage().show();
        });

        graduateStudent_btn.setOnAction(event -> {
            graduateStudent_panel.setVisible(true);
            asp_prev_btn.setDisable(true);
            asp_next_btn.setDisable(false);
            getUsers("??????????????????");
        });

        asp_next_btn.setOnAction(event -> {
            counterAspirants++;
            changeAspirants();
            asp_name.setText(user_list.get(counterAspirants).getFirstName());
            asp_surnname.setText(user_list.get(counterAspirants).getSurName());
            asp_secname.setText(user_list.get(counterAspirants).getSecName());
            asp_surviser.setText(user_list.get(counterAspirants).getSupervisor());
            asp_sci_dir.setText(user_list.get(counterAspirants).getSci_direction());
            asp_theme.setText(user_list.get(counterAspirants).getTheme());
        });

        asp_prev_btn.setOnAction(event -> {
            counterAspirants--;
            changeAspirants();
            asp_name.setText(user_list.get(counterAspirants).getFirstName());
            asp_surnname.setText(user_list.get(counterAspirants).getSurName());
            asp_secname.setText(user_list.get(counterAspirants).getSecName());
            asp_surviser.setText(user_list.get(counterAspirants).getSupervisor());
            asp_sci_dir.setText(user_list.get(counterAspirants).getSci_direction());
            asp_theme.setText(user_list.get(counterAspirants).getTheme());
        });

        add_asp_btn.setOnAction(event -> {
            asp_panel_edit.setVisible(true);
            asp_change_btn.setText("????????????");
        });

        edit_asp_btn.setOnAction(event -> {
            asp_panel_edit.setVisible(true);
            asp_change_btn.setText("??????????????");
            asp_nameFiled.setText(user_list.get(counterAspirants).getFirstName());
            asp_surnameFiled.setText(user_list.get(counterAspirants).getSurName());
            asp_secnameFiled.setText(user_list.get(counterAspirants).getSecName());
            asp_editTheme_Field.setText(user_list.get(counterAspirants).getTheme());
            asp_edit_Sci_dir_Field.setText(user_list.get(counterAspirants).getSci_direction());
            asp_ComboBox.setValue(user_list.get(counterAspirants).getSupervisor());
        });

        asp_change_btn.setOnAction(event -> {
            if(asp_change_btn.getText().equals("??????????????")){
                updateDB("UPDATE " + Constants.ASPIRANTS_TABLE + " SET "+ Constants.NAME
                                +"=" + Constants.dm + asp_nameFiled.getText() + Constants.dm + ", " + Constants.SURNAME + "=" + Constants.dm+
                                asp_surnameFiled.getText() + Constants.dm+ ", " + Constants.SECNAME + "=" + Constants.dm + asp_secnameFiled.getText()
                                + Constants.dm + ", " + Constants.THEME + "="+ Constants.dm + asp_editTheme_Field.getText() + Constants.dm+ ", " +
                                Constants.SCI_DIRECTION + "=" + Constants.dm + asp_edit_Sci_dir_Field.getText() + Constants.dm +", " +
                                Constants.SUPERVISOR + "=" +Constants.dm + asp_ComboBox.getValue() + Constants.dm + " WHERE " + Constants.ID + "=" +
                                user_list.get(counterAspirants).getID(),
                        "UPDATE");

                newScene.alertWindow("??????????!", "???????? ?????????????? ??????????????!");
            }
            else {
                updateDB("INSERT INTO " + Constants.ASPIRANTS_TABLE + "(" + Constants.NAME
                        + "," + Constants.SURNAME + "," + Constants.SECNAME + ", " +
                        Constants.SUPERVISOR + ","+ Constants.SCI_DIRECTION + ","+ Constants.THEME +")"+ " VALUES ("+ Constants.dm +
                        asp_nameFiled.getText() + Constants.dm + ", " + Constants.dm + asp_surnameFiled.getText() + Constants.dm + ", " + Constants.dm+
                        asp_secnameFiled.getText() + Constants.dm +", " + Constants.dm + asp_ComboBox.getValue() + Constants.dm + ", "+ Constants.dm +
                        asp_edit_Sci_dir_Field.getText() + Constants.dm +", "+ Constants.dm +
                        asp_editTheme_Field.getText()+  Constants.dm+")", "INSERT");
                newScene.alertWindow("??????????!", "???????? ?????????????? ??????????????!");
            }


            asp_panel_edit.setVisible(false);
            asp_edit_Sci_dir_Field.clear();
            asp_nameFiled.clear();
            asp_surnameFiled.clear();
            asp_secnameFiled.clear();
            asp_editTheme_Field.clear();
            asp_edit_Sci_dir_Field.clear();
            asp_ComboBox.setValue("");
            getUsers("??????????????????");
        });

        delete_asp_btn.setOnAction(event -> {
            deleteDate("?????????????????? ??????????????????", "???? ????????????????, ???? ???????????? ???????????????? ?????????????????? " +
                            user_list.get(counterAspirants).getSurName()+" " +
                            user_list.get(counterAspirants).getFirstName()+ " "+
                            user_list.get(counterAspirants).getSecName() + "?",
                    "DELETE FROM " + Constants.ASPIRANTS_TABLE + " WHERE " +
                            Constants.ID + "=" + user_list.get(counterAspirants).getID(), "UPDATE");
            getUsers("??????????????????");
        });

        closeAsp_btn.setOnAction(event -> {
            graduateStudent_panel.setVisible(false);
            counterAspirants=0;
        });

        asp_hidePan_btn.setOnAction(event -> {
            asp_panel_edit.setVisible(false);
            asp_edit_Sci_dir_Field.clear();
            asp_nameFiled.clear();
            asp_surnameFiled.clear();
            asp_secnameFiled.clear();
            asp_editTheme_Field.clear();
            asp_edit_Sci_dir_Field.clear();
            asp_ComboBox.setValue("");
        });

        group_btn.setOnAction(event -> {
            group_panel.setVisible(true);
            groups_table.setVisible(true);
            syllabus.setVisible(false);

            id_group.setCellValueFactory(new PropertyValueFactory<>("id"));
            name_group.setCellValueFactory(new PropertyValueFactory<>("name"));
            surname_group.setCellValueFactory(new PropertyValueFactory<>("surName"));
            secname_group.setCellValueFactory(new PropertyValueFactory<>("secName"));
            getGroups(Constants.STUDENTGROUPS_TABLE);
            key = "??????????";
            table_Displaying(key);
        });

        group_next_btn.setOnAction(event -> {
            counterAspirants++;
            table_Displaying(key);
        });

        group_prev_btn.setOnAction(event -> {
            counterAspirants--;
            table_Displaying(key);
        });

        closeGroup_btn.setOnAction(event -> {
            group_panel.setVisible(false);
            groupsName_list.clear();
            group_list.clear();
            counterAspirants=0;
        });

        addGroup_btn.setOnAction(event -> {
            if(key.equals("??????????")){
                add_editPanel.setVisible(true);
                add_edit_Final_btn.setText("????????????");
                add_edit_nameField.clear();
                add_edit_surnnameField.clear();
                add_edit_secnameField.clear();
            }
            else {
                add_editPanel_syllabus.setVisible(true);
                add_edit_Final_btn1.setText("????????????");
                add_edit_subjectField.clear();
                add_edit_teacherComboBox.setValue("");
                add_edit_hoursField.clear();
                add_edit_examField.clear();
            }
        });

        editGroup_btn.setOnAction(event -> {
            if(tableList !=null) {
                if(key.equals("??????????")){
                    add_editPanel.setVisible(true);
                    add_edit_Final_btn.setText("??????????????");
                }
                else {
                    add_editPanel_syllabus.setVisible(true);
                    add_edit_Final_btn1.setText("??????????????");
                }
            }
            else
                newScene.alertWindow("??????????!", "?????????????? ???????? ?????? ??????????????????????!");
        });

        add_edit_Hide_btn.setOnAction(event -> {
            add_editPanel.setVisible(false);
            add_edit_nameField.clear();
            add_edit_surnnameField.clear();
            add_edit_secnameField.clear();
            tableList = null;
        });

        add_edit_Hide_btn1.setOnAction(event -> {
            add_editPanel_syllabus.setVisible(false);
            add_edit_subjectField.clear();
            add_edit_teacherComboBox.setValue("");
            add_edit_hoursField.clear();
            add_edit_examField.clear();
            tableList = null;
        });

        deleteGroup_btn.setOnAction(event -> {
            if(tableList !=null) {
                if(key.equals("??????????")){
                    deleteDate("?????????????????? ????????????????", "???? ????????????????, ???? ???????????? ???????????????? ???????????????? " +
                            tableList.getSurName()+" " + tableList.getName()+ " "+ tableList.getSecName() + "?",
                            "DELETE FROM " + Constants.STUDENTGROUPS_TABLE + " WHERE " +
                            Constants.ID + "=" + tableList.getRealID(), "UPDATE");
                }
                else {
                    deleteDate("?????????????????? ?????????? ????????????????!", "???? ????????????????, ???? ???????????? ???????????????? ???? ?????????",
                            "DELETE FROM " + Constants.SYLLABUS_TABLE + " WHERE " +
                                    Constants.ID + "=" + tableList.getRealID(), "UPDATE");
                }
            }
            else
                newScene.alertWindow("??????????!", "?????????????? ???????? ?????? ??????????????????!");
        });

        add_edit_Final_btn.setOnAction(event -> {
            if(add_edit_Final_btn.getText().equals("??????????????")){
                updateDB("UPDATE " + Constants.STUDENTGROUPS_TABLE + " SET " +
                        Constants.NAME + "=" + Constants.dm + add_edit_nameField.getText() + Constants.dm + ", " +
                        Constants.SURNAME + "=" + Constants.dm + add_edit_surnnameField.getText() + Constants.dm + ", " +
                        Constants.SECNAME + "=" + Constants.dm + add_edit_secnameField.getText() + Constants.dm + " WHERE " +
                        Constants.ID + "=" + tableList.getRealID(), "UPDATE");
                newScene.alertWindow("??????????!", "???????? ?????????????? ????????????????!");
            }
            else if(add_edit_Final_btn.getText().equals("????????????")){
                updateDB("INSERT INTO " + Constants.STUDENTGROUPS_TABLE + "(" + Constants.NAME
                        + "," + Constants.SURNAME + "," + Constants.SECNAME + ", " +
                        Constants.GROUPNAME + ")"+ " VALUES (" + Constants.dm+ add_edit_nameField.getText() + Constants.dm +", " + Constants.dm +
                        add_edit_surnnameField.getText() + Constants.dm + ", " + Constants.dm + add_edit_secnameField.getText() +  Constants.dm + ", " + Constants.dm+
                        groupsName_list.get(counterAspirants) + Constants.dm + ")", "INSERT");
                newScene.alertWindow("??????????!", "???????? ?????????????? ??????????????!");
            }
            add_editPanel.setVisible(false);
            add_editPanel_syllabus.setVisible(false);
            tableList = null;
            table_Displaying(key);
            add_edit_nameField.clear();
            add_edit_surnnameField.clear();
            add_edit_secnameField.clear();
            add_edit_subjectField.clear();
            add_edit_teacherComboBox.setValue("");
            add_edit_hoursField.clear();
            add_edit_examField.clear();
        });

        add_edit_Final_btn1.setOnAction(event -> {
            if(add_edit_Final_btn1.getText().equals("??????????????")){
                updateDB("UPDATE " + Constants.SYLLABUS_TABLE + " SET "+ Constants.HOURS
                                +"=" + Constants.dm + add_edit_hoursField.getText() +  Constants.dm +", " + Constants.SUBJNAME + "=" + Constants.dm +
                                add_edit_subjectField.getText() + Constants.dm + ", " + Constants.TEACHER + "=" + Constants.dm +
                                add_edit_teacherComboBox.getValue() + Constants.dm + ", " + Constants.EXAM + "=" + Constants.dm +
                                add_edit_examField.getText() + Constants.dm + " WHERE " + Constants.ID + "=" + tableList.getRealID(),
                        "UPDATE");
                newScene.alertWindow("??????????!", "???????? ?????????????? ??????????????!");

            }
            else if(add_edit_Final_btn1.getText().equals("????????????")){
                updateDB("INSERT INTO " + Constants.SYLLABUS_TABLE + "(" + Constants.SUBJNAME
                        + "," + Constants.TEACHER + "," + Constants.HOURS + "," +
                        Constants.EXAM + ", " + Constants.GROUPNAME + ")"+ " VALUES ("+ Constants.dm +
                        add_edit_subjectField.getText() + Constants.dm + ", " + Constants.dm + add_edit_teacherComboBox.getValue() + Constants.dm+ ", " + Constants.dm+
                        add_edit_hoursField.getText() + Constants.dm + ", " + Constants.dm + add_edit_examField.getText() + Constants.dm +  ", " + Constants.dm +
                        groupsName_list.get(counterAspirants) + Constants.dm + ")", "INSERT");
                newScene.alertWindow("??????????!", "???????? ?????????????? ??????????????!");
            }
            add_editPanel.setVisible(false);
            add_editPanel_syllabus.setVisible(false);
            tableList = null;
            table_Displaying(key);
            add_edit_nameField.clear();
            add_edit_surnnameField.clear();
            add_edit_secnameField.clear();
            add_edit_subjectField.clear();
            add_edit_teacherComboBox.setValue("");
            add_edit_hoursField.clear();
            add_edit_examField.clear();
        });

        syllabus_btn.setOnAction(event -> {
            group_panel.setVisible(true);
            groups_table.setVisible(false);
            syllabus.setVisible(true);

            subject.setCellValueFactory(new PropertyValueFactory<>("subject"));
            nameTeacher.setCellValueFactory(new PropertyValueFactory<>("teacher"));
            hours.setCellValueFactory(new PropertyValueFactory<>("hours"));
            exam.setCellValueFactory(new PropertyValueFactory<>("exam"));
            getGroups(Constants.SYLLABUS_TABLE);
            key = "???????????????????? ????????";
            table_Displaying(key);
        });

        schedule_btn.setOnAction(event -> {
            schedulePanel.setVisible(true);

            subjnumberCol_Monday.setCellValueFactory(new PropertyValueFactory<>(Constants.UNIT_NUMBER));
            subjnameCol_Monday.setCellValueFactory(new PropertyValueFactory<>(Constants.SUBJNAME));
            classCol_Monday.setCellValueFactory(new PropertyValueFactory<>(Constants.CLASS_NUMBER));

            subjnumberCol_Tuseday.setCellValueFactory(new PropertyValueFactory<>(Constants.UNIT_NUMBER));
            subjnameCol_Tuesday.setCellValueFactory(new PropertyValueFactory<>(Constants.SUBJNAME));
            classCol_Tuesday.setCellValueFactory(new PropertyValueFactory<>(Constants.CLASS_NUMBER));

            subjnumberCol_Wednesday.setCellValueFactory(new PropertyValueFactory<>(Constants.UNIT_NUMBER));
            subjnameCol_Wednesday.setCellValueFactory(new PropertyValueFactory<>(Constants.SUBJNAME));
            classCol_Wednesday.setCellValueFactory(new PropertyValueFactory<>(Constants.CLASS_NUMBER));

            subjnumberCol_Thursday.setCellValueFactory(new PropertyValueFactory<>(Constants.UNIT_NUMBER));
            subjnameCol_Thursday.setCellValueFactory(new PropertyValueFactory<>(Constants.SUBJNAME));
            classCol_Thursday.setCellValueFactory(new PropertyValueFactory<>(Constants.CLASS_NUMBER));

            subjnumberCol_Friday.setCellValueFactory(new PropertyValueFactory<>(Constants.UNIT_NUMBER));
            subjnameCol_Friday.setCellValueFactory(new PropertyValueFactory<>(Constants.SUBJNAME));
            classCol_Friday.setCellValueFactory(new PropertyValueFactory<>(Constants.CLASS_NUMBER));


            getGroups(Constants.STUDENTGROUPS_TABLE);
            key = "??????????????";
            table_Displaying(key);
        });

        schedule_next_btn.setOnAction(event -> {
            counterAspirants++;
            table_Displaying(key);
        });

        schedule_prev_btn.setOnAction(event -> {
            counterAspirants--;
            table_Displaying(key);
        });

        closeSchedule.setOnAction(event -> {
            counterAspirants=0;
            schedulePanel.setVisible(false);
        });

        hide_btn_schedule.setOnAction(event -> {
            editPanel_schedule.setVisible(false);
            classField_schedule.clear();
            numberField_schedule.clear();
            subjectsComboBox_schedule.setValue("");
            tableList=null;
        });

        edit_Schedule_btn.setOnAction(event -> {
            if(tableList !=null) {
                editPanel_schedule.setVisible(true);
                add_edit_btn_schedule.setText("??????????????");
                numberField_schedule.setText(tableList.getUnitnumber());
                classField_schedule.setText(tableList.getClassnumber());
                subjectsComboBox_schedule.setValue(tableList.getSubjname());
            }
            else
                newScene.alertWindow("??????????!", "?????????????? ???????? ?????? ??????????????????????!");
        });

        add_edit_btn_schedule.setOnAction(event -> {

            String day;
            switch (tabSchedule.getSelectionModel().getSelectedIndex()){
                case 1:
                    day = "????????????????";
                    break;
                case 2:
                    day = "????????????";
                    break;
                case 3:
                    day = "????????????";
                    break;
                case 4:
                    day = "??'????????????";
                    break;
                default:
                    day = "??????????????????";
            }

            if(add_edit_btn_schedule.getText().equals("??????????????")){
                updateDB("UPDATE " + Constants.SCHEDULE_TABLE + " SET " +
                        Constants.UNIT_NUMBER + "=" + Constants.dm + numberField_schedule.getText() + Constants.dm + ", " +
                        Constants.SUBJNAME + "=" + Constants.dm + subjectsComboBox_schedule.getValue() + Constants.dm + ", " +
                        Constants.CLASS_NUMBER + "=" + Constants.dm + classField_schedule.getText() + Constants.dm + " WHERE " +
                        Constants.ID + "=" + tableList.getId(), "UPDATE");
                newScene.alertWindow("??????????!", "???????? ?????????????? ????????????????!");
            }
            else if(add_edit_btn_schedule.getText().equals("????????????")){
                updateDB("INSERT INTO " + Constants.SCHEDULE_TABLE + "(" + Constants.UNIT_NUMBER
                        + "," + Constants.SUBJNAME + "," + Constants.CLASS_NUMBER + ", " +
                        Constants.GROUPNAME + ", " + Constants.STUDY_DAY + ")"+ " VALUES (" + Constants.dm + numberField_schedule.getText() + Constants.dm+", "+ Constants.dm +
                        subjectsComboBox_schedule.getValue() + Constants.dm + ", " + Constants.dm + classField_schedule.getText() + Constants.dm + ", " + Constants.dm +
                        groupsName_list.get(counterAspirants) + Constants.dm + ", " + Constants.dm + day + Constants.dm +")", "INSERT");
                newScene.alertWindow("??????????!", "???????? ?????????????? ??????????????!");
            }
            editPanel_schedule.setVisible(false);
            tableList = null;
            table_Displaying(key);
            classField_schedule.clear();
            numberField_schedule.clear();
            subjectsComboBox_schedule.setValue("");
        });

        add_Shedule_btn.setOnAction(event -> {
            editPanel_schedule.setVisible(true);
            numberField_schedule.clear();
            classField_schedule.clear();
            add_edit_btn_schedule.setText("????????????");
            subjectsComboBox_schedule.setValue("?????????????? ????????????????????");
        });

        delete_schedule_btn.setOnAction(event -> {
            if(tableList != null) {
                deleteDate("?????????????????? ?????????? ????????????????!", "???? ????????????????, ???? ???????????? ???????????????? ???? ?????????",
                        "DELETE FROM " + Constants.SCHEDULE_TABLE + " WHERE " +
                                Constants.ID + "=" + tableList.getId(), "UPDATE");
            }

            else
                newScene.alertWindow("??????????!", "?????????????? ???????? ?????? ??????????????????!");
        });

        diplomaWork_btn.setOnAction(event -> {
            studentDiplomPanel.setVisible(true);

            diplomGroup_col.setCellValueFactory(new PropertyValueFactory<>(Constants.GROUPNAME));
            diplomStudent_col.setCellValueFactory(new PropertyValueFactory<>(Constants.FULL_STUDENT_NAME));
            diplomTeacher_col.setCellValueFactory(new PropertyValueFactory<>(Constants.TEACHER));
            diplomTheme_col.setCellValueFactory(new PropertyValueFactory<>(Constants.THEME));

            key = "????????????";
            table_Displaying(key);
        });

        closeDiplom_btn.setOnAction(event -> {
            studentDiplomPanel.setVisible(false);
            group_list.clear();
            counterAspirants=0;
        });

        editDiplom_btn.setOnAction(event -> {
            add_editDiplom_btn.setText("??????????????");
            if(tableList !=null) {
                edit_add_Diplom_Panel.setVisible(true);
            }
            else
                newScene.alertWindow("??????????!", "?????????????? ???????? ?????? ??????????????????????!");
        });

        addNewDiplom_btn.setOnAction(event -> {
            edit_add_Diplom_Panel.setVisible(true);
            diplom_Theme_field.clear();
            add_editDiplom_btn.setText("????????????");
            diplom_Theme_field.setPromptText("???????? ??????????????????");
            diplom_Group_Combo.setValue("??????????");
            diplom_Student_Combo.setValue("??????????????");
            diplom_Teacher_Combo.setValue("????????????????");
        });

        hide_btn_Diplom.setOnAction(event -> {
            tableList = null;
            edit_add_Diplom_Panel.setVisible(false);
        });

        add_editDiplom_btn.setOnAction(event -> {
            if(add_editDiplom_btn.getText().equals("??????????????")){
                updateDB("UPDATE " + Constants.GRADUATES_TABLE + " SET " +
                        Constants.FULL_STUDENT_NAME + "=" + Constants.dm + diplom_Student_Combo.getValue() + Constants.dm + ", " +
                        Constants.TEACHER + "=" + Constants.dm + diplom_Teacher_Combo.getValue() + Constants.dm + ", " +
                        Constants.THEME + "=" + Constants.dm + diplom_Theme_field.getText() + Constants.dm + ", " +
                        Constants.GROUPNAME + "=" + Constants.dm + diplom_Group_Combo.getValue() + Constants.dm + " WHERE " +
                        Constants.ID + "=" + tableList.getRealID(), "UPDATE");
                newScene.alertWindow("??????????!", "???????? ?????????????? ????????????????!");
            }
            else if(add_editDiplom_btn.getText().equals("????????????")){
                updateDB("INSERT INTO " + Constants.GRADUATES_TABLE + "(" + Constants.FULL_STUDENT_NAME
                        + "," + Constants.TEACHER + "," + Constants.THEME + ", " +
                        Constants.GROUPNAME + ")"+ " VALUES (" + Constants.dm +
                        diplom_Student_Combo.getValue() + Constants.dm+", "+ Constants.dm + diplom_Teacher_Combo.getValue() +
                        Constants.dm + ", " + Constants.dm + diplom_Theme_field.getText() + Constants.dm + ", " + Constants.dm +
                        diplom_Group_Combo.getValue() + Constants.dm + " )", "INSERT");
                newScene.alertWindow("??????????!", "???????? ?????????????? ??????????????!");
            }
            edit_add_Diplom_Panel.setVisible(false);
            tableList = null;
            table_Displaying(key);
        });

        deleteDiplom_btn.setOnAction(event -> {
            if(tableList != null) {
                deleteDate("?????????????????? ????????????????????!", "???? ????????????????, ???? ???????????? ???????????????? " + tableList.getStudent()+ "?",
                        "DELETE FROM " + Constants.GRADUATES_TABLE + " WHERE " +
                                Constants.ID + "=" + tableList.getRealID(), "UPDATE");
            }

            else
                newScene.alertWindow("??????????!", "?????????????? ???????? ?????? ??????????????????!");
        });

        employee_btn.setOnAction(event -> {
            employees_panel.setVisible(true);
            emp_prev_btn.setDisable(true);
            emp_next_btn.setDisable(false);
            getUsers("??????????????????????????");

        });

        emp_next_btn.setOnAction(event -> {
            counterAspirants++;
            changeAspirants();
            name_emp.setText(user_list.get(counterAspirants).getFirstName());
            sur_emp.setText(user_list.get(counterAspirants).getSurName());
            sec_emp.setText(user_list.get(counterAspirants).getSecName());
            pos_emp.setText(user_list.get(counterAspirants).getPosition());
            degree_emp.setText(user_list.get(counterAspirants).getDegree());
            tel_emp.setText(user_list.get(counterAspirants).getTelephone());
            imgchanger = false;
            loadImg(user_list.get(counterAspirants).getID(), img_emp);
        });

        emp_prev_btn.setOnAction(event -> {
            counterAspirants--;
            changeAspirants();
            name_emp.setText(user_list.get(counterAspirants).getFirstName());
            sur_emp.setText(user_list.get(counterAspirants).getSurName());
            sec_emp.setText(user_list.get(counterAspirants).getSecName());
            pos_emp.setText(user_list.get(counterAspirants).getPosition());
            degree_emp.setText(user_list.get(counterAspirants).getDegree());
            tel_emp.setText(user_list.get(counterAspirants).getTelephone());
            imgchanger = false;
            loadImg(user_list.get(counterAspirants).getID(), img_emp);
        });

        close_Employees.setOnAction(event -> {
            counterAspirants=0;
            employees_panel.setVisible(false);
        });

        editProfile.setOnAction(event -> {
            editProfile.setDisable(true);
            editProfilePanel.setVisible(true);
            getUsers("");
            imgchanger = false;
            loadImg(getID(), imageditProfile);
            profileName_field.setText(user.getFirstName());
            profilesurName_field.setText(user.getSurName());
            profilesecName_field.setText(user.getSecName());
            profilePosition_field.setText(user.getPosition());
            profileDegree_field.setText(user.getDegree());
            profileTelephone_field.setText(user.getTelephone());
        });

        uploadImageProfile_btn.setOnAction(event -> {
            fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Images", "*.jpg", "*.png", "*.jpeg")); //

            file = fileChooser.showOpenDialog(uploadImageProfile_btn.getScene().getWindow());
            Image image = null;
            try {
                image = new Image(file.toURL().toString());
                imageditProfile.setImage(image);
            } catch (MalformedURLException | NullPointerException e) {
                newScene.alertWindow("??????????", "???????? ???? ??????????????!");
                imgchanger = false;
                loadImg(getID(), imageditProfile);
            }
        });

        backBtn_profile.setOnAction(event -> {
            editProfilePanel.setVisible(false);
            editProfile.setDisable(false);
        });

        edit_final_btn.setOnAction(event -> {
            if(file!=null){
                uploadImg();
            }
            updateDB("UPDATE " + Constants.EMPLOYEES_TABLE + " SET " +
                    Constants.NAME + "=" + Constants.dm + profileName_field.getText() + Constants.dm + ", " +
                    Constants.SURNAME + "=" + Constants.dm + profilesurName_field.getText() + Constants.dm + ", " +
                    Constants.SECNAME + "=" + Constants.dm + profilesecName_field.getText() + Constants.dm + ", " +
                    Constants.ACADEMIC_DEGREE + "=" + Constants.dm + profileDegree_field.getText() + Constants.dm + ", " +
                    Constants.TELEPHONE + "=" + Constants.dm + profileTelephone_field.getText() + Constants.dm + ", " +
                    Constants.POSITION + "=" + Constants.dm + profilePosition_field.getText() + Constants.dm + " WHERE " +
                    Constants.ID + "=" + getID(), "UPDATE");
            newScene.alertWindow("??????????!", "???????? ?????????????? ????????????????!");
            editProfilePanel.setVisible(false);
            realInitForm();
            editProfile.setDisable(false);
        });
    }

    public void uploadImg(){
        String commandINSERT;
        try {
            if(img_action.equals("UPDATE")) {
                commandINSERT = "UPDATE img SET image=? WHERE iduser=?";
            }
            else {
                commandINSERT = "INSERT INTO img(image, iduser) VALUES(?, ?)";
            }
            store = db.getDbConnection().prepareStatement(commandINSERT);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            store.setBinaryStream(1, fileInputStream, fileInputStream.available());
            store.setString(2, getID());
            store.execute();

        }
        catch (SQLException | IOException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    public void loadImg(String id, ImageView photo) {
        String commandSELEC = "SELECT image FROM img WHERE iduser=?";
        PreparedStatement retrieve = null;
        try {
            retrieve = db.getDbConnection().prepareStatement(commandSELEC);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            assert retrieve != null;
            retrieve.setString(1, id);
            ResultSet resultSet = retrieve.executeQuery();
            if(resultSet.first()){
                Blob blob = resultSet.getBlob(1);
                InputStream inputStream = blob.getBinaryStream();
                Image image = new Image(inputStream);
                if(blob.length()>0){
                    img_action="UPDATE";
                    imgchanger = true;
                }
                photo.setImage(image);
            }
            if (!imgchanger){
                Image image;
                if (getID().equals("0") && photo.equals(photoUser)) {
                    image = new Image(new FileInputStream("src/media/student.jpg"));
                }
                else {
                    image = new Image(new FileInputStream("src/media/teacher.png"));
                }
                photo.setImage(image);
                img_action="INSERT";
            }

        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    // ??????????, ???? ???????????????? ???????????????? ?????????????? name
    private List<String> getData(String data) {

        // Define the data you will be returning, in this case, a List of Strings for the ComboBox
        List<String> options = new ArrayList<>();
        switch (data) {
            case "??????????????????":
                try {
                    ResultSet res = db.getResSet("select * from " + Constants.EMPLOYEES_TABLE);

                    while (res.next()) {
                        options.add(res.getString(Constants.SURNAME) + " " + res.getString(Constants.NAME) + " " + res.getString(Constants.SECNAME));
                    }
                } catch (SQLException ex) {
                    return null;
                }
                break;
            case "??????????":
                try {
                    ResultSet res = db.getResSet("select * from " + Constants.STUDENTGROUPS_TABLE);

                    while (res.next()) {
                        options.add(res.getString(Constants.GROUPNAME));
                    }
                    Set<String> set = new HashSet<>(options);
                    options.clear(); // ?????????????????? ??????????????????
                    options.addAll(set);
                } catch (SQLException ex) {
                    return null;
                }
                break;
            case "????????????????":
                try {
                    ResultSet res = db.getResSet("select * from " + Constants.SYLLABUS_TABLE);

                    while (res.next()) {
                        options.add(res.getString(Constants.SUBJNAME));
                    }
                } catch (SQLException ex) {
                    return null;
                }
                break;
            case "????????????????":
                try {
                    ResultSet res = db.getResSet("select * from " + Constants.STUDENTGROUPS_TABLE);

                    while (res.next()) {
                        options.add(res.getString(Constants.SURNAME) + " " + res.getString(Constants.NAME) + " " +
                                res.getString(Constants.SECNAME));
                    }
                } catch (SQLException ex) {
                    return null;
                }
                break;
        }
        return options;
    }

    // ?????????? ?????????????????????????? ?????????? ??????????????????????, ???? ?????????????? ?? ??????????????
    public void realInitForm() {
        loadImg(getID(), photoUser);
        if(getID().equals("0")){
            editProfile.setVisible(false);
            add_asp_btn.setVisible(false);
            edit_asp_btn.setVisible(false);
            delete_asp_btn.setVisible(false);
            addGroup_btn.setVisible(false);
            editGroup_btn.setVisible(false);
            deleteGroup_btn.setVisible(false);
            add_Shedule_btn.setVisible(false);
            edit_Schedule_btn.setVisible(false);
            delete_schedule_btn.setVisible(false);
            addNewDiplom_btn.setVisible(false);
            editDiplom_btn.setVisible(false);
            deleteDiplom_btn.setVisible(false);
        }

        try {
            ResultSet res = db.getResSet("select * from " + Constants.EMPLOYEES_TABLE + " WHERE " + Constants.ID + "=" + getID());
            while (res.next()){
                user_main.setFirstName(res.getString(Constants.NAME));
                user_main.setSurName(res.getString(Constants.SURNAME));
                user_main.setSecName(res.getString(Constants.SECNAME));
                user_main.setDegree(res.getString(Constants.ACADEMIC_DEGREE));
                user_main.setPosition(res.getString(Constants.POSITION));
            }
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
        name_label.setText(user_main.getFirstName() + " " + user_main.getSecName() + " " + user_main.getSurName());
        degree_label.setText(user_main.getPosition());
        if(getID().equals("0")) {
            name_label.setText("??????????????, ????????????????!");
        }
    }

    // ?????????? ?????? ?????????????????? ?????????? ?????? ???????????????????? ???? ?????????????????????? ?? ???? ?? ?????????? ???? ?? ?????????? user_list ???? ???????????????????????? ???? ??????????
    public void getUsers(String user_type) {
        user =null;
        user_list.clear();
        if (user_type.equals("??????????????????")){
            try {
                ResultSet res = db.getResSet("select * from " + Constants.ASPIRANTS_TABLE);
                while (res.next()){
                    user = new User(res.getString(Constants.NAME), res.getString(Constants.SURNAME),
                            res.getString(Constants.SECNAME), res.getString(Constants.SUPERVISOR),
                            res.getString(Constants.SCI_DIRECTION), res.getString(Constants.THEME), res.getString(Constants.ID));
                    user_list.add(user);
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            asp_name.setText(user_list.get(counterAspirants).getFirstName());
            asp_surnname.setText(user_list.get(counterAspirants).getSurName());
            asp_secname.setText(user_list.get(counterAspirants).getSecName());
            asp_surviser.setText(user_list.get(counterAspirants).getSupervisor());
            asp_sci_dir.setText(user_list.get(counterAspirants).getSci_direction());
            asp_theme.setText(user_list.get(counterAspirants).getTheme());
        }
        else if(user_type.equals("??????????????????????????")){
            try {
                ResultSet res = db.getResSet("select * from " + Constants.EMPLOYEES_TABLE);
                while (res.next()){
                    user = new User(res.getString(Constants.NAME), res.getString(Constants.SURNAME),
                            res.getString(Constants.SECNAME), res.getString(Constants.POSITION),
                            res.getString(Constants.ACADEMIC_DEGREE), res.getString(Constants.TELEPHONE), res.getString(Constants.ID));
                    user_list.add(user);
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            name_emp.setText(user_list.get(counterAspirants).getFirstName());
            sur_emp.setText(user_list.get(counterAspirants).getSurName());
            sec_emp.setText(user_list.get(counterAspirants).getSecName());
            pos_emp.setText(user_list.get(counterAspirants).getPosition());
            degree_emp.setText(user_list.get(counterAspirants).getDegree());
            tel_emp.setText(user_list.get(counterAspirants).getTelephone());
            loadImg(user_list.get(counterAspirants).getID(), img_emp);
        }
        else {
            try {
                ResultSet res = db.getResSet("select * from " + Constants.EMPLOYEES_TABLE);
                while (res.next()){
                    if(res.getString(Constants.ID).equals(getID()))
                        user = new User(res.getString(Constants.NAME), res.getString(Constants.SURNAME),
                            res.getString(Constants.SECNAME), res.getString(Constants.POSITION),
                            res.getString(Constants.ACADEMIC_DEGREE), res.getString(Constants.TELEPHONE), res.getString(Constants.ID));
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // ?????????? ???????????????????????? ????????????????????
    public void changeAspirants() {

        if(counterAspirants > 0){
            asp_prev_btn.setDisable(false);
            emp_prev_btn.setDisable(false);
        }
        else {
            asp_prev_btn.setDisable(true);
            emp_prev_btn.setDisable(true);
        }

        if(counterAspirants == user_list.size()-1){
            asp_next_btn.setDisable(true);
            emp_next_btn.setDisable(true);
            counterAspirants = user_list.size()-1;
        }
        else{
            asp_next_btn.setDisable(false);
            emp_next_btn.setDisable(false);
        }
    }

    // ?????????? ?????? ?????????????????? ???????? ????????
    public void getGroups(String table) {
        try {
            ResultSet res = db.getResSet("SELECT " + Constants.GROUPNAME + " FROM " +
                    table);
            while (res.next()){
                groupsName_list.add(res.getString(Constants.GROUPNAME));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        Set<String> set = new HashSet<>(groupsName_list);
        groupsName_list.clear(); // ?????????????????? ??????????????????
        groupsName_list.addAll(set);
    }

    // ?????????? ???????????????????? ?????????????? ???????????? ?? ????
    public void table_Displaying(String action) {
        if(counterAspirants > 0) {
            group_prev_btn.setDisable(false);
            schedule_prev_btn.setDisable(false);
        }
        else{
            group_prev_btn.setDisable(true);
            schedule_prev_btn.setDisable(true);
        }

        if(counterAspirants == groupsName_list.size()-1){
            group_next_btn.setDisable(true);
            schedule_next_btn.setDisable(true);
            counterAspirants = groupsName_list.size()-1;
        }
        else{
            group_next_btn.setDisable(false);
            schedule_next_btn.setDisable(false);
        }

        group_list.clear();
        switch (action) {
            case "??????????":
                label_groups.setText("?????????? " + groupsName_list.get(counterAspirants));
                try {
                    ResultSet res = db.getResSet("SELECT * FROM " + Constants.STUDENTGROUPS_TABLE + " WHERE " +
                            Constants.GROUPNAME + "='" + groupsName_list.get(counterAspirants) + "'");
                    int counter = 1;// ???????????? ?????? ?????????????????? ????????????
                    while (res.next()) {
                        group_list.add(new TableList(String.valueOf(counter), res.getString(Constants.NAME),
                                res.getString(Constants.SURNAME), res.getString(Constants.SECNAME), res.getString(Constants.ID)));
                        counter++;
                    }
                    groups_table.setItems(group_list);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "???????????????????? ????????":
                label_groups.setText("???????????????????? ???????? ?????????? " + groupsName_list.get(counterAspirants));
                try {
                    ResultSet res = db.getResSet("SELECT * FROM " + Constants.SYLLABUS_TABLE + " WHERE " +
                            Constants.GROUPNAME + "='" + groupsName_list.get(counterAspirants) + "'");
                    while (res.next()) {
                        group_list.add(new TableList(res.getString(Constants.SUBJNAME), res.getString(Constants.TEACHER),
                                res.getString(Constants.HOURS), res.getString(Constants.EXAM), res.getString(Constants.ID)));
                    }
                    syllabus.setItems(group_list);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "????????????":
                try {
                    ResultSet res = db.getResSet("SELECT * FROM " + Constants.GRADUATES_TABLE);
                    while (res.next()) {
                        group_list.add(new TableList(res.getString(Constants.FULL_STUDENT_NAME), res.getString(Constants.TEACHER),
                                res.getString(Constants.GROUPNAME), res.getString(Constants.THEME), res.getString(Constants.ID)));
                    }
                    diplomStudent_table.setItems(group_list);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "??????????????":
                scheduleLabel.setText("?????????????? ?????????? " + groupsName_list.get(counterAspirants));
                monday_list.clear();
                tuesday_list.clear();
                wednesday_list.clear();
                thursday_list.clear();
                friday_list.clear();
                try {
                    ResultSet res = db.getResSet("SELECT * FROM " + Constants.SCHEDULE_TABLE + " WHERE " +
                            Constants.GROUPNAME + "='" + groupsName_list.get(counterAspirants) + "'");
                    while (res.next()) {
                        switch (res.getString(Constants.STUDY_DAY)) {
                            case "??????????????????":
                                monday_list.add(new TableList(res.getString(Constants.ID),
                                        res.getString(Constants.UNIT_NUMBER), res.getString(Constants.SUBJNAME),
                                        res.getString(Constants.CLASS_NUMBER), res.getString(Constants.STUDY_DAY)));
                                break;
                            case "????????????????":
                                tuesday_list.add(new TableList(res.getString(Constants.ID),
                                        res.getString(Constants.UNIT_NUMBER), res.getString(Constants.SUBJNAME),
                                        res.getString(Constants.CLASS_NUMBER), res.getString(Constants.STUDY_DAY)));
                                break;
                            case "????????????":
                                wednesday_list.add(new TableList(res.getString(Constants.ID),
                                        res.getString(Constants.UNIT_NUMBER), res.getString(Constants.SUBJNAME),
                                        res.getString(Constants.CLASS_NUMBER), res.getString(Constants.STUDY_DAY)));
                                break;
                            case "????????????":
                                thursday_list.add(new TableList(res.getString(Constants.ID),
                                        res.getString(Constants.UNIT_NUMBER), res.getString(Constants.SUBJNAME),
                                        res.getString(Constants.CLASS_NUMBER), res.getString(Constants.STUDY_DAY)));
                                break;
                            case "??'????????????":
                                friday_list.add(new TableList(res.getString(Constants.ID),
                                        res.getString(Constants.UNIT_NUMBER), res.getString(Constants.SUBJNAME),
                                        res.getString(Constants.CLASS_NUMBER), res.getString(Constants.STUDY_DAY)));
                                break;
                        }
                    }

                    tableMonday.setItems(monday_list);
                    tableTuseday.setItems(tuesday_list);
                    tableWednesday.setItems(wednesday_list);
                    tableThursday.setItems(thursday_list);
                    tableFriday.setItems(friday_list);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }


    }

    // ?????????? ???????????????????? ?????? ???????????????????? ???? ??????????????
    public void onTableSelectItem() {
        switch (key) {
            case "??????????":
                tableList = groups_table.getSelectionModel().getSelectedItem();
                if (tableList != null) {
                    add_edit_nameField.setText(tableList.getName());
                    add_edit_surnnameField.setText(tableList.getSurName());
                    add_edit_secnameField.setText(tableList.getSecName());
                }
                break;
            case "???????????????????? ????????":
                tableList = syllabus.getSelectionModel().getSelectedItem();
                if (tableList != null) {
                    add_edit_subjectField.setText(tableList.getSubject());
                    add_edit_teacherComboBox.setValue(tableList.getTeacher());
                    add_edit_hoursField.setText(tableList.getHours());
                    add_edit_examField.setText(tableList.getExam());
                }
                break;
            case "????????????":
                tableList = diplomStudent_table.getSelectionModel().getSelectedItem();
                if (tableList != null) {
                    diplom_Student_Combo.setValue(tableList.getStudent());
                    diplom_Teacher_Combo.setValue(tableList.getTeacher());
                    diplom_Group_Combo.setValue(tableList.getGroupname());
                    diplom_Theme_field.setText(tableList.getTheme());
                    System.out.println("dsd");
                }
                break;
            case "??????????????":
                switch (tabSchedule.getSelectionModel().getSelectedIndex()) {
                    case 0:
                        tableList = tableMonday.getSelectionModel().getSelectedItem();
                        break;
                    case 1:
                        tableList = tableTuseday.getSelectionModel().getSelectedItem();
                        break;
                    case 2:
                        tableList = tableWednesday.getSelectionModel().getSelectedItem();
                        break;
                    case 3:
                        tableList = tableThursday.getSelectionModel().getSelectedItem();
                        break;
                    case 4:
                        tableList = tableFriday.getSelectionModel().getSelectedItem();
                        break;
                }
                if (tableList != null) {
                    numberField_schedule.setText(tableList.getUnitnumber());
                    subjectsComboBox_schedule.setValue(tableList.getSubjname());
                    classField_schedule.setText(tableList.getClassnumber());
                }
                break;
        }
    }

    // ?????????? ?????????????????? ????
    public void updateDB(String command_str, String command) {
        try {
            Statement statement = db.getDbConnection().createStatement();
            // ?????????????????? ???????????? update SQL
            if(command.equals("UPDATE"))
                statement.execute(command_str);
            if(command.equals("INSERT")){
                statement.executeUpdate(command_str);
                if(graduateStudent_panel.isVisible())
                    counterAspirants++;
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // ?????????? ?????????????????? ???????????????????? ?????????????? ?????? ??????????????????
    public void deleteDate(String header, String content, String command_str, String command) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("??????????!");
        alert.setHeaderText(header);
        alert.setResizable(false);
        alert.setContentText(content);

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);



        if (button == ButtonType.OK) {
            updateDB(command_str, command);
            if(graduateStudent_panel.isVisible()){
                counterAspirants--;
                getUsers("??????????????????");
            }
            else{
                tableList = null;
                table_Displaying(key);
            }
        } else {
            tableList =null;
            user = null;
        }
    }
}

