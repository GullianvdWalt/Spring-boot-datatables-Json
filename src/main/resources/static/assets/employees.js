$(document).ready(function() {
    initEmployeesTable();
});

function initEmployeesTable(){
    let employeesTable = $('#employeesTable').DataTable( {
        processing: true,
        stateSave:true,
        serverSide: true,
        // ajax:{
        //   url: "/products",
        //   type: "POST",
        //   dataType: "json",
        //   contentType: "application/json",
        //   data: d => ( JSON.stringify(d))
        // },
        stateSaveCallback: function (settings, data) {
            console.log(data)
            // Send an Ajax request to the server with the state object
            // $.ajax({
            //     "url": "/state_save",
            //     "data": data,
            //     "dataType": "json",
            //     "type": "POST",
            //     "success": function () {
            //     }
            // });
        },
        language: {
            sInfoEmpty: "0 Employees",
            emptyTable: "No employees added yet",
            searchPlaceholder: "Search Employees"
        },
        lengthMenu: [[1, 2, 5, -1], [1, 2, 5, 'All']],
        sAjaxSource: "/employees/get-employees",
        sAjaxDataProp: "",
        order: [[ 0, "asc" ]],
        aoColumns: [
            { mData: 'id' },
            { mData: 'name' },
            { mData: 'surname' },
            { mData: 'idNumber' },
        ],
    });
}