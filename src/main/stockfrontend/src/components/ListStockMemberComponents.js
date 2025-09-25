import React from 'react'
import { Link } from 'react-router-dom'


function ListStockMemberComponents() {
  return (
    <div className='container'>
      <h2 className='text-center'>List BikeMembers</h2>
        <Link to='/add-bikemembers' className='btn btn-primary 'mb-2>Add Bikemember</Link>
       
      {/* <button onClick={saveMember}>insert</button> */}
      <table className='table table-bordered table-striped'>
        <thead>
            <th>BikeMember Id</th>
            <th>BikeMember FirstName</th>
            <th>BikeMember LastName</th>
            <th>BikeMember EmailName</th>
            <th>Mod</th>

        </thead>

        <tbody>
            {
                
                
            }
        </tbody>
      </table>
    </div>
  )
}

export default ListStockMemberComponents
